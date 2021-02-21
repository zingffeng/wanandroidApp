package top.zingfeng.wanandroid.network.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import top.zingfeng.wanandroid.network.bean.NavigationBean;
import top.zingfeng.wanandroid.network.bean.SystemArticleListBean;
import top.zingfeng.wanandroid.network.bean.SystemArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/15
 */
public interface SystemService {

    /**
     * 请求体系数据
     * @return 返回请求数据
     */
    @GET(value = "/tree/json")
    Call<SystemArticleBean> getSystemInfo();

    @GET(value = "/article/list/{page}/json/")
    Call<SystemArticleListBean> getSystemArticleList(@Path(value = "page") Integer page, @Query(value = "cid") Integer cid);

    @GET(value = "/navi/json")
    Call<NavigationBean> getNavigationList();
}
