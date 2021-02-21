package top.zingfeng.wanandroid.network.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import top.zingfeng.wanandroid.network.bean.HotKeyBean;
import top.zingfeng.wanandroid.network.bean.QueryDataBean;

/**
 * @author zingfeng
 * @date On 2021/2/19
 */
public interface SearchService {

    /**
     * 热门搜索请求
     * @return
     */
    @GET(value = "/hotkey/json")
    Call<HotKeyBean> hotKey();

    @POST(value = "/article/query/{page}/json")
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    Call<QueryDataBean> queryData(@Path(value = "page") Integer page, @Query(value = "k") String k);
}
