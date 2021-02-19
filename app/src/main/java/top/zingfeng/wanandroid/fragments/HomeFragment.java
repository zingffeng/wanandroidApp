package top.zingfeng.wanandroid.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.HomeArticleAdapter;
import top.zingfeng.wanandroid.adapter.HomeTopArticleAdapter;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.ArticleBean;
import top.zingfeng.wanandroid.network.bean.BannerBean;
import top.zingfeng.wanandroid.network.bean.TopArticleBean;
import top.zingfeng.wanandroid.network.services.HomeService;

/**
 * @author zingfeng
 * @date On 2021/2/9
 */
public class HomeFragment extends Fragment {

    private Context mCtx;

    @BindView(R.id.nv_page)
    NestedScrollView mNvPage;

    @BindView(R.id.home_banner)
    Banner mHomeBanner;

    @BindView(R.id.rv_article)
    RecyclerView mRvArticle;

    @BindView(R.id.rv_top_article)
    RecyclerView mRvTopArticle;

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

//    @BindView(R.id.fab_top)
//    FloatingActionButton mFabTop;

    DrawerLayout mDlSideLayout;

    private Integer page = 1;

    private HomeArticleAdapter mHomeArticleAdapter;
    private HomeTopArticleAdapter mHomeTopArticleAdapter;

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
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        initView();
        initData();
        initEvent();
        return view;
    }

    private void initView(){
        
    }

    private void initData(){
        requestData();
        initAdapter();
        setPullRefresh();
    }

    private void initEvent(){
//        mFabTop.setOnClickListener(v -> {
//            mNvPage.smoothScrollTo(0,0);
//        });


//        AppBarLayout appBarLayout =  getActivity().findViewById(R.id.abl_bar);
//        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                if (verticalOffset == 0){
//
//                }else {
//
//                }
//            }
//        });
    }

    /**
     * 请求首页获取数据
     */
    private void requestData(){
        Integer defaultPage = 0;
        Retrofit retrofit = BaseRetrofit.getRetrofit();
        HomeService homeService = retrofit.create(HomeService.class);
        Call<ArticleBean> home = homeService.getHomeArticle(defaultPage);
        Call<BannerBean> banner = homeService.getBanner();
        Call<TopArticleBean> homeTopArticle = homeService.getHomeTopArticle();
        home.enqueue(new Callback<ArticleBean>() {
            @Override
            public void onResponse(Call<ArticleBean> call, Response<ArticleBean> response) {
                List<ArticleBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                mHomeArticleAdapter.setNewInstance(datas);
                mHomeArticleAdapter.notifyDataSetChanged();
                mHomeArticleAdapter.setOnItemClickListener((adapter, view, position) -> ARouter.getInstance()
                        .build("/view/ArticleDetailActivity")
                        .withString("title", response.body().getData().getDatas().get(position).getTitle())
                        .withString("url", response.body().getData().getDatas().get(position).getLink())
                        .navigation());
                mSrlRefresh.finishRefresh();
            }

            @Override
            public void onFailure(Call<ArticleBean> call, Throwable t) {

            }
        });
        homeTopArticle.enqueue(new Callback<TopArticleBean>() {
            @Override
            public void onResponse(Call<TopArticleBean> call, Response<TopArticleBean> response) {
                List<TopArticleBean.DataBean> data = response.body().getData();
                mHomeTopArticleAdapter.setNewInstance(data);
                mHomeTopArticleAdapter.notifyDataSetChanged();
                mHomeTopArticleAdapter.setOnItemClickListener((adapter, view, position) -> {
                    ARouter.getInstance()
                            .build("/view/ArticleDetailActivity")
                            .withString("title", response.body().getData().get(position).getTitle())
                            .withString("url", response.body().getData().get(position).getLink())
                            .navigation();
                });
            }

            @Override
            public void onFailure(Call<TopArticleBean> call, Throwable t) {

            }
        });
        banner.enqueue(new Callback<BannerBean>() {
            @Override
            public void onResponse(Call<BannerBean> call, Response<BannerBean> response) {
                mHomeBanner.setAdapter(new BannerImageAdapter<BannerBean.DataBean>(response.body().getData()) {
                    @Override
                    public void onBindView(BannerImageHolder holder, BannerBean.DataBean data, int position, int size) {
                        holder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        //图片加载自己实现
                        Glide.with(holder.itemView)
                                .load(data.getImagePath())
                                .into(holder.imageView);
                        mHomeBanner.setOnBannerListener((data1, position1) -> {
                            ARouter.getInstance()
                                    .build("/view/ArticleDetailActivity")
                                    .withString("title", response.body().getData().get(position1).getTitle())
                                    .withString("url", response.body().getData().get(position1).getUrl())
                                    .navigation();
                        });
                    }
                }).addBannerLifecycleObserver(getViewLifecycleOwner())//添加生命周期观察者
                        .setIndicator(new CircleIndicator(mCtx));;
            }

            @Override
            public void onFailure(Call<BannerBean> call, Throwable t) {

            }
        });
    }

    /**
     * 初始化Adapter
     */
    private void initAdapter(){
        //首页数据Adapter
        LinearLayoutManager articleManager = new LinearLayoutManager(mCtx);

        articleManager.setOrientation(RecyclerView.VERTICAL);
        mHomeArticleAdapter = new HomeArticleAdapter(R.layout.item_home_article, null);
        mRvArticle.setLayoutManager(articleManager);
        mRvArticle.setAdapter(mHomeArticleAdapter);


        //置顶数据Adapter
        LinearLayoutManager topArticleManager = new LinearLayoutManager(mCtx);
        topArticleManager.setOrientation(RecyclerView.VERTICAL);
        mHomeTopArticleAdapter = new HomeTopArticleAdapter(R.layout.item_home_top_article, null);
        mRvTopArticle.setLayoutManager(topArticleManager);
        mRvTopArticle.setAdapter(mHomeTopArticleAdapter);
    }

    /**
     * 设置上拉加载
     */
    private void setPullRefresh(){
        mSrlRefresh.setRefreshHeader(new MaterialHeader(mCtx));
        mSrlRefresh.setRefreshFooter(new ClassicsFooter(mCtx));
        mSrlRefresh.setOnRefreshListener(refreshLayout -> requestData());
        mSrlRefresh.setOnLoadMoreListener(refreshLayout -> {
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            HomeService homeService = retrofit.create(HomeService.class);
            Call<ArticleBean> home = homeService.getHomeArticle(page);
            home.enqueue(new Callback<ArticleBean>() {
                @Override
                public void onResponse(Call<ArticleBean> call, Response<ArticleBean> response) {
                    List<ArticleBean.DataBean.DatasBean> datas = response.body().getData().getDatas();
                    mHomeArticleAdapter.addData(datas);
                    mHomeArticleAdapter.notifyDataSetChanged();
                    page = page + 1;
                    mSrlRefresh.finishLoadMore();
                }

                @Override
                public void onFailure(Call<ArticleBean> call, Throwable t) {
                    mSrlRefresh.finishLoadMore(false);
                }
            });
        });
    }
}