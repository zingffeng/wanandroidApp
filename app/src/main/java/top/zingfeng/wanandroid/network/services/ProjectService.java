package top.zingfeng.wanandroid.network.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import top.zingfeng.wanandroid.network.bean.ProjectBean;
import top.zingfeng.wanandroid.network.bean.ProjectListBean;

/**
 * @author zingfeng
 * @date On 2021/2/16
 */
public interface ProjectService {

    /**
     * 请求项目数据
     * @return 返回数据
     */
    @GET(value = "/project/tree/json")
    Call<ProjectBean> getProject();

    /**
     *
     * @param page 页数
     * @param cid cid
     * @return 返回数据
     */
    @GET(value = "/project/list/{page}/json")
    Call<ProjectListBean> getSystemArticleList(@Path(value = "page") Integer page, @Query(value = "cid") Integer cid);
}
