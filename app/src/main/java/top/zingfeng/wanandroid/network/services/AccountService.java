package top.zingfeng.wanandroid.network.services;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import top.zingfeng.wanandroid.network.bean.ArticleBean;
import top.zingfeng.wanandroid.network.bean.CollectBean;
import top.zingfeng.wanandroid.network.bean.UserBean;
import top.zingfeng.wanandroid.network.bean.UserInfoBean;

/**
 * @author zingfeng
 * @date On 2021/2/18
 */
public interface AccountService {
    /**
     * 登录请求
     * @param username 账号
     * @param password 密码
     * @return 返回请求数据
     */
    @POST(value = "/user/login")
    @FormUrlEncoded
    Call<UserBean> login(@Field("username") String username, @Field("password") String password);

    /**
     *
     * @return 返回请求数据
     */
    @GET(value = "/lg/collect/list/0/json")
    Call<CollectBean> collect();

    @GET(value = "/lg/coin/userinfo/json")
    Call<UserInfoBean> userInfo();
}
