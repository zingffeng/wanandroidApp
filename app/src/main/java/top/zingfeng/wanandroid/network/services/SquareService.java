package top.zingfeng.wanandroid.network.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import top.zingfeng.wanandroid.network.bean.SquareArticleBean;
import top.zingfeng.wanandroid.network.bean.TopArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/12
 */
public interface SquareService {

    /**
     * 请求首页文章
     * @param page 页码
     * @return 返回请求数据
     */
    @GET(value = "/user_article/list/{page}/json")
    Call<SquareArticleBean> getSquareArticle(@Path(value = "page") Integer page);
}
