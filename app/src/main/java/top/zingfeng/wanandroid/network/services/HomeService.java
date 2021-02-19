package top.zingfeng.wanandroid.network.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import top.zingfeng.wanandroid.network.bean.ArticleBean;
import top.zingfeng.wanandroid.network.bean.BannerBean;
import top.zingfeng.wanandroid.network.bean.TopArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/9
 */
public interface HomeService {

    /**
     * 请求首页文章
     * @param page 页码
     * @return 返回请求数据
     */
    @GET(value = "/article/list/{page}/json")
    Call<ArticleBean> getHomeArticle(@Path(value = "page") Integer page);

    /**
     * 请求首页顶置文章
     * @return 返回请求数据
     */
    @GET(value = "/article/top/json")
    Call<TopArticleBean> getHomeTopArticle();

    /**
     * 请求首页轮播
     * @return 返回请求数据
     */
    @GET(value = "/banner/json")
    Call<BannerBean> getBanner();
}
