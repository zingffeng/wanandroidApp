package top.zingfeng.wanandroid.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.HomeTopArticleAdapter;
import top.zingfeng.wanandroid.adapter.SquareArticleAdapter;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.ArticleBean;
import top.zingfeng.wanandroid.network.bean.SquareArticleBean;
import top.zingfeng.wanandroid.network.bean.TopArticleBean;
import top.zingfeng.wanandroid.network.services.SquareService;

/**
 * @author zingfeng
 * @date On 2021/2/9
 */
public class SquareFragment extends Fragment {

    private Context mCtx;
    private Integer page = 1;

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

    @BindView(R.id.rv_square_article)
    RecyclerView mRvSquareArticle;

    private SquareArticleAdapter mSquareArticleAdapter;

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
        View view = inflater.inflate(R.layout.fragment_square, container, false);
        ButterKnife.bind(this, view);
        initData();
        initEvent();
        return view;
    }

    private void initData(){
        mSquareArticleAdapter = new SquareArticleAdapter(R.layout.item_home_top_article, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mCtx);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRvSquareArticle.setLayoutManager(linearLayoutManager);
        mRvSquareArticle.setAdapter(mSquareArticleAdapter);

        Retrofit retrofit = BaseRetrofit.getRetrofit();
        SquareService squareService = retrofit.create(SquareService.class);
        Call<SquareArticleBean> squareArticle = squareService.getSquareArticle(0);
        squareArticle.enqueue(new Callback<SquareArticleBean>() {
            @Override
            public void onResponse(Call<SquareArticleBean> call, Response<SquareArticleBean> response) {
                mSquareArticleAdapter.setNewInstance(response.body().getData().getDatas());
                mSquareArticleAdapter.notifyDataSetChanged();
                mSquareArticleAdapter.setOnItemClickListener((adapter, view, position) -> {
                    ARouter.getInstance()
                            .build("/view/ArticleDetailActivity")
                            .withString("title", response.body().getData().getDatas().get(position).getTitle())
                            .withString("url", response.body().getData().getDatas().get(position).getLink())
                            .navigation();
                });
            }

            @Override
            public void onFailure(Call<SquareArticleBean> call, Throwable t) {

            }
        });
    }

    private void initEvent(){
        mSrlRefresh.setRefreshHeader(new MaterialHeader(mCtx));
        mSrlRefresh.setRefreshFooter(new ClassicsFooter(mCtx));
        mSrlRefresh.setOnRefreshListener(v -> {
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            SquareService squareService = retrofit.create(SquareService.class);
            Call<SquareArticleBean> squareArticle = squareService.getSquareArticle(0);
            squareArticle.enqueue(new Callback<SquareArticleBean>() {
                @Override
                public void onResponse(Call<SquareArticleBean> call, Response<SquareArticleBean> response) {
                    mSquareArticleAdapter.setNewInstance(response.body().getData().getDatas());
                    mSquareArticleAdapter.notifyDataSetChanged();
                    mSrlRefresh.finishRefresh();
                }

                @Override
                public void onFailure(Call<SquareArticleBean> call, Throwable t) {
                    mSrlRefresh.finishRefresh(false);
                }
            });
        });

        mSrlRefresh.setOnLoadMoreListener(refreshLayout -> {
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            SquareService squareService = retrofit.create(SquareService.class);
            Call<SquareArticleBean> squareArticle = squareService.getSquareArticle(page);
            squareArticle.enqueue(new Callback<SquareArticleBean>() {
                @Override
                public void onResponse(Call<SquareArticleBean> call, Response<SquareArticleBean> response) {
                    mSquareArticleAdapter.addData(response.body().getData().getDatas());
                    mSquareArticleAdapter.notifyDataSetChanged();
                    mSrlRefresh.finishLoadMore();
                    page = page + 1;
                }

                @Override
                public void onFailure(Call<SquareArticleBean> call, Throwable t) {
                    mSrlRefresh.finishLoadMore(false);
                }
            });
        });


    }
}