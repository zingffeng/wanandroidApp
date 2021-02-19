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

import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.ProjectContentAdapter;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.ProjectBean;
import top.zingfeng.wanandroid.network.bean.ProjectListBean;
import top.zingfeng.wanandroid.network.services.ProjectService;

/**
 * @author zingfeng
 * @date On 2021/2/16
 */
public class ProjectDetailFragment extends Fragment {

    @BindView(R.id.rv_project_content)
    RecyclerView mRvProjectContent;

    @BindView(R.id.srl_project_refresh)
    SmartRefreshLayout mSrlProjectRefresh;

    private ProjectContentAdapter mProjectContentAdapter;

    private static final String ARG_PARAM1 = "param1";

    private ProjectBean.DataBean mParam1;

    private Context mCtx;

    public ProjectDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment ProjectDetailFragment.
     */
    public static ProjectDetailFragment newInstance(ProjectBean.DataBean param1) {
        ProjectDetailFragment fragment = new ProjectDetailFragment();
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
            mParam1 = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_project_detail, container, false);
        ButterKnife.bind(this, view);
        initData();
        initEvent();
        if (mParam1 != null){
            requestData();
        }
        return view;
    }

    private Integer page = 2;
    private void initData(){
        mProjectContentAdapter = new ProjectContentAdapter(R.layout.item_project_content, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mCtx);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRvProjectContent.setLayoutManager(linearLayoutManager);
        mRvProjectContent.setAdapter(mProjectContentAdapter);

        mSrlProjectRefresh.setRefreshHeader(new MaterialHeader(mCtx));
        mSrlProjectRefresh.setRefreshFooter(new ClassicsFooter(mCtx));
        mSrlProjectRefresh.setOnRefreshListener(refreshLayout -> {
            requestData();
            mSrlProjectRefresh.finishRefresh();
        });
        mSrlProjectRefresh.setOnLoadMoreListener(refreshLayout -> {
            int id = mParam1.getId();
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            ProjectService projectService = retrofit.create(ProjectService.class);
            Call<ProjectListBean> systemArticleList = projectService.getSystemArticleList(page, id);
            systemArticleList.enqueue(new Callback<ProjectListBean>() {
                @Override
                public void onResponse(Call<ProjectListBean> call, Response<ProjectListBean> response) {
                    List<ProjectListBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                    mProjectContentAdapter.addData(datas);
                    mProjectContentAdapter.notifyDataSetChanged();
                    mSrlProjectRefresh.finishLoadMore();
                    page = page + 1;
                }

                @Override
                public void onFailure(Call<ProjectListBean> call, Throwable t) {
                    mSrlProjectRefresh.finishLoadMore(false);
                }
            });
        });
    }

    private void initEvent(){

    }

    private void requestData(){
        int id = mParam1.getId();
        Retrofit retrofit = BaseRetrofit.getRetrofit();
        ProjectService projectService = retrofit.create(ProjectService.class);
        Call<ProjectListBean> systemArticleList = projectService.getSystemArticleList(1, id);
        systemArticleList.enqueue(new Callback<ProjectListBean>() {
            @Override
            public void onResponse(Call<ProjectListBean> call, Response<ProjectListBean> response) {
                List<ProjectListBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                mProjectContentAdapter.setNewInstance(datas);
                mProjectContentAdapter.notifyDataSetChanged();
                mProjectContentAdapter.setOnItemClickListener((adapter, view, position) -> {
                    ARouter.getInstance()
                            .build("/view/ArticleDetailActivity")
                            .withString("title", datas.get(position).getTitle())
                            .withString("url", datas.get(position).getLink())
                            .navigation();
                });
            }

            @Override
            public void onFailure(Call<ProjectListBean> call, Throwable t) {

            }
        });
    }
}