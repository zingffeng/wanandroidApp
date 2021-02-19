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
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.SystemArticleAdapter;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.SystemArticleBean;
import top.zingfeng.wanandroid.network.bean.SystemArticleListBean;
import top.zingfeng.wanandroid.network.services.SystemService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SystemDetailTypeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SystemDetailTypeFragment extends Fragment {

    @BindView(R.id.rv_system_item)
    RecyclerView mRvSystemItem;

    @BindView(R.id.tv_not_more_data)
    TextView mTvNotMoreData;

    @BindView(R.id.srl_system_detail_refresh)
    SmartRefreshLayout mSrlSystemDetailRefresh;

    private SystemArticleAdapter mSystemArticleAdapter;

    private static final String ARG_PARAM1 = "param1";

    private SystemArticleBean.DataBean.ChildrenBean mChildrenBeanParam;

    private Context mCtx;

    public SystemDetailTypeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment SystemDetailTypeFragment.
     */
    public static SystemDetailTypeFragment newInstance(SystemArticleBean.DataBean.ChildrenBean param1) {
        SystemDetailTypeFragment fragment = new SystemDetailTypeFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mChildrenBeanParam = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_system_detail_type, container, false);
        ButterKnife.bind(this, view);
        initData();
        initEvent();
        return view;
    }

    private void initData(){
        mSystemArticleAdapter = new SystemArticleAdapter(R.layout.item_system_article, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mCtx);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRvSystemItem.setLayoutManager(linearLayoutManager);
        mRvSystemItem.setAdapter(mSystemArticleAdapter);

        requestData();
        setPullRefresh();
    }

    private void initEvent(){

    }

    private void requestData(){
        Integer id = mChildrenBeanParam.getId();
        Retrofit retrofit = BaseRetrofit.getRetrofit();
        SystemService systemService = retrofit.create(SystemService.class);
        Call<SystemArticleListBean> systemArticleList = systemService.getSystemArticleList(0, id);
        systemArticleList.enqueue(new Callback<SystemArticleListBean>() {
            @Override
            public void onResponse(Call<SystemArticleListBean> call, Response<SystemArticleListBean> response) {
                List<SystemArticleListBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                mSystemArticleAdapter.setNewInstance(datas);
                mSystemArticleAdapter.notifyDataSetChanged();
                mSystemArticleAdapter.setOnItemClickListener((adapter, view, position) -> {
                    ARouter.getInstance()
                            .build("/view/ArticleDetailActivity")
                            .withString("title", response.body().getData().getDatas().get(position).getTitle())
                            .withString("url", response.body().getData().getDatas().get(position).getLink())
                            .navigation();
                });
            }

            @Override
            public void onFailure(Call<SystemArticleListBean> call, Throwable t) {

            }
        });
    }

    private Integer page = 1;
    private void setPullRefresh(){
        mSrlSystemDetailRefresh.setRefreshHeader(new MaterialHeader(mCtx));
        mSrlSystemDetailRefresh.setRefreshFooter(new ClassicsFooter(mCtx));
        mSrlSystemDetailRefresh.setOnRefreshListener(refreshLayout -> {
            requestData();
            mSrlSystemDetailRefresh.finishRefresh();
        });
        mSrlSystemDetailRefresh.setOnLoadMoreListener(refreshLayout -> {
            Integer id = mChildrenBeanParam.getId();
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            SystemService systemService = retrofit.create(SystemService.class);
            Call<SystemArticleListBean> systemArticleList = systemService.getSystemArticleList(page, id);
            systemArticleList.enqueue(new Callback<SystemArticleListBean>() {
                @Override
                public void onResponse(Call<SystemArticleListBean> call, Response<SystemArticleListBean> response) {
                    List<SystemArticleListBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                    if (datas.isEmpty()){
                        mTvNotMoreData.setVisibility(View.VISIBLE);
                    }
                    mSystemArticleAdapter.addData(datas);
                    mSystemArticleAdapter.notifyDataSetChanged();
                    mSystemArticleAdapter.setOnItemClickListener((adapter, view, position) -> {
                        ARouter.getInstance()
                                .build("/view/ArticleDetailActivity")
                                .withString("title", response.body().getData().getDatas().get(position).getTitle())
                                .withString("url", response.body().getData().getDatas().get(position).getLink())
                                .navigation();
                    });
                    page = page + 1;
                    mSrlSystemDetailRefresh.finishLoadMore();
                }

                @Override
                public void onFailure(Call<SystemArticleListBean> call, Throwable t) {
                    mSrlSystemDetailRefresh.finishLoadMore(false);
                }
            });
        });
    }
}