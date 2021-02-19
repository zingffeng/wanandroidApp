package top.zingfeng.wanandroid.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.NavigationTitleAdapter;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.SystemArticleBean;
import top.zingfeng.wanandroid.network.services.SystemService;

/**
 * @author zingfeng
 * @date On 2021/2/14
 */
public class SystemDetailFragment extends Fragment {

    private Context mCtx;

    @BindView(R.id.rv_navigation_title)
    RecyclerView mRvNavigationTitle;

    private NavigationTitleAdapter mNavigationTitleAdapter;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_system_detail, container, false);
        ButterKnife.bind(this, view);
        initData();
        initEvent();
        return view;
    }

    private void initData(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mCtx);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mNavigationTitleAdapter = new NavigationTitleAdapter(R.layout.item_navigation_title, null);
        mRvNavigationTitle.setLayoutManager(linearLayoutManager);
        mRvNavigationTitle.setAdapter(mNavigationTitleAdapter);
    }

    private void initEvent(){
        Retrofit retrofit = BaseRetrofit.getRetrofit();
        SystemService systemService = retrofit.create(SystemService.class);
        Call<SystemArticleBean> systemInfo = systemService.getSystemInfo();
        systemInfo.enqueue(new Callback<SystemArticleBean>() {
            @Override
            public void onResponse(Call<SystemArticleBean> call, Response<SystemArticleBean> response) {
                mNavigationTitleAdapter.setNewInstance(response.body().getData());
                mNavigationTitleAdapter.setOnItemClickListener((adapter, view, position) -> {
                    SystemArticleBean.DataBean dataBean = response.body().getData().get(position);
                    ARouter.getInstance()
                            .build("/fragment/SystemItemActivity")
                            .withParcelable("data", dataBean)
                            .navigation();
                });
            }

            @Override
            public void onFailure(Call<SystemArticleBean> call, Throwable t) {

            }
        });
    }
}