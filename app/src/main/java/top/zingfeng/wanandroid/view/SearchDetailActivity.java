package top.zingfeng.wanandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
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
import top.zingfeng.wanandroid.adapter.SearchDetailAdapter;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.QueryDataBean;
import top.zingfeng.wanandroid.network.services.SearchService;

/**
 * @author zingfeng
 * @date 2021/02/20
 */
@Route(path = "/view/SearchDetailActivity")
public class SearchDetailActivity extends AppCompatActivity {

    @Autowired
    String titleContent;

    @BindView(R.id.iv_side_nav)
    ImageView mIvSideNav;

    @BindView(R.id.tv_search_content)
    TextView mTvSearchContent;

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

    @BindView(R.id.rv_search_detail)
    RecyclerView mRvSearchDetail;

    @BindView(R.id.tv_no_data)
    TextView mTvNoData;

    private SearchDetailAdapter mSearchDetailAdapter;

    private Integer page = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_detail);
        ARouter.getInstance().inject(this);
        ButterKnife.bind(this);
        initData();
        initEvent();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mTvSearchContent.setText(titleContent);
    }

    private void initData(){
        mSearchDetailAdapter = new SearchDetailAdapter(R.layout.item_search_detail, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRvSearchDetail.setLayoutManager(linearLayoutManager);
        mRvSearchDetail.setAdapter(mSearchDetailAdapter);

        mSrlRefresh.setRefreshHeader(new MaterialHeader(getApplicationContext()));
        mSrlRefresh.setRefreshFooter(new ClassicsFooter(getApplicationContext()));
        mSrlRefresh.setOnRefreshListener(refreshLayout -> {
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            SearchService searchService = retrofit.create(SearchService.class);
            Call<QueryDataBean> android = searchService.queryData(page, titleContent);
            android.enqueue(new Callback<QueryDataBean>() {
                @Override
                public void onResponse(Call<QueryDataBean> call, Response<QueryDataBean> response) {
                    List<QueryDataBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                    mSearchDetailAdapter.setNewInstance(datas);
                    mSearchDetailAdapter.notifyDataSetChanged();
                    mSrlRefresh.finishRefresh();
                }

                @Override
                public void onFailure(Call<QueryDataBean> call, Throwable t) {
                    mSrlRefresh.finishRefresh(false);
                }
            });
        });
        mSrlRefresh.setOnLoadMoreListener(refreshLayout -> {
            page = page + 1;
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            SearchService searchService = retrofit.create(SearchService.class);
            Call<QueryDataBean> android = searchService.queryData(page, titleContent);
            android.enqueue(new Callback<QueryDataBean>() {
                @Override
                public void onResponse(Call<QueryDataBean> call, Response<QueryDataBean> response) {
                    List<QueryDataBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                    mSearchDetailAdapter.addData(datas);
                    mSearchDetailAdapter.notifyDataSetChanged();
                    mSrlRefresh.finishLoadMore();
                }

                @Override
                public void onFailure(Call<QueryDataBean> call, Throwable t) {
                    mSrlRefresh.finishLoadMore(false);
                }
            });
        });

        mTvSearchContent.setText(titleContent);
        Retrofit retrofit = BaseRetrofit.getRetrofit();
            SearchService searchService = retrofit.create(SearchService.class);
            Call<QueryDataBean> android = searchService.queryData(0, titleContent);
            android.enqueue(new Callback<QueryDataBean>() {
                @Override
                public void onResponse(Call<QueryDataBean> call, Response<QueryDataBean> response) {
                    List<QueryDataBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                    if (datas.isEmpty()){
                        mSrlRefresh.setVisibility(View.GONE);
                        mTvNoData.setVisibility(View.VISIBLE);
                    }else {
                        mSrlRefresh.setVisibility(View.VISIBLE);
                        mTvNoData.setVisibility(View.GONE);
                        mSearchDetailAdapter.setNewInstance(datas);
                    }
                    mSearchDetailAdapter.setOnItemClickListener((adapter, view, position) -> {
                        ARouter.getInstance()
                                .build("/view/ArticleDetailActivity")
                                .withString("url", datas.get(position).getLink())
                                .withString("title", datas.get(position).getTitle())
                                .navigation();
                    });
                }

                @Override
                public void onFailure(Call<QueryDataBean> call, Throwable t) {

                }
            });
    }

    private void initEvent(){
        mIvSideNav.setOnClickListener(v -> finish());
    }
}