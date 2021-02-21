package top.zingfeng.wanandroid.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.NavigationDetailTypeAdapter;
import top.zingfeng.wanandroid.adapter.NavigationTypeAdapter;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.NavigationBean;
import top.zingfeng.wanandroid.network.services.SystemService;

/**
 * @author zingfeng
 * @date 2021/02/14
 */
public class SystemNavigationFragment extends Fragment {

    private Context mCtx;

    @BindView(R.id.rv_nav_type)
    RecyclerView mRvNavType;

    @BindView(R.id.rv_nav_detail)
    RecyclerView mRvNavDetail;

    private NavigationTypeAdapter mNavigationTypeAdapter;
    private NavigationDetailTypeAdapter mNavigationDetailTypeAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_system_navigation, container, false);
        ButterKnife.bind(this, view);
        initData();
        initEvent();
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mCtx = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCtx = null;
    }

    private void initData(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mCtx);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mNavigationTypeAdapter = new NavigationTypeAdapter(R.layout.item_navigation_type, null);
        mRvNavType.setLayoutManager(linearLayoutManager);
        mRvNavType.setAdapter(mNavigationTypeAdapter);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(mCtx);
        linearLayoutManager1.setOrientation(RecyclerView.VERTICAL);
        mNavigationDetailTypeAdapter = new NavigationDetailTypeAdapter(R.layout.item_navigation_detail_type, null);
        mRvNavDetail.setLayoutManager(linearLayoutManager1);
        mRvNavDetail.setAdapter(mNavigationDetailTypeAdapter);
    }

    private void initEvent(){
        Retrofit retrofit = BaseRetrofit.getRetrofit();
        SystemService systemService = retrofit.create(SystemService.class);
        Call<NavigationBean> navigationList = systemService.getNavigationList();
        navigationList.enqueue(new Callback<NavigationBean>() {
            @Override
            public void onResponse(Call<NavigationBean> call, Response<NavigationBean> response) {
                List<String> types = new ArrayList<>();
                List<NavigationBean.DataBean> data = response.body().getData();
                for (NavigationBean.DataBean dataBean: data){
                    types.add(dataBean.getName());
                }
                mNavigationTypeAdapter.setNewInstance(types);
                mNavigationDetailTypeAdapter.setNewInstance(response.body().getData());
            }

            @Override
            public void onFailure(Call<NavigationBean> call, Throwable t) {

            }
        });
        mNavigationTypeAdapter.setOnItemClickListener((adapter, view, position) -> {
            mNavigationTypeAdapter.setPosition(position);
            mNavigationTypeAdapter.notifyDataSetChanged();
            mRvNavDetail.smoothScrollToPosition(position);
        });
        mRvNavDetail.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mRvNavDetail.getLayoutManager();
                int firstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                mNavigationTypeAdapter.setPosition(firstVisibleItemPosition);
                mNavigationTypeAdapter.notifyDataSetChanged();
                mRvNavType.smoothScrollToPosition(firstVisibleItemPosition);
            }
        });
    }
}