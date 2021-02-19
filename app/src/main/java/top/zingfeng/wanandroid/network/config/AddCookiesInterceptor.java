package top.zingfeng.wanandroid.network.config;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import top.zingfeng.wanandroid.base.MyApplication;

/**
 * 非首次请求
 * @author zingfeng
 * @date On 2021/2/18
 */
public class AddCookiesInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        HashSet<String> preferences = (HashSet<String>) MyApplication.getAppContext().getSharedPreferences("config", Context.MODE_PRIVATE).getStringSet("cookie", null);
        if (preferences != null){
            for (String cookie: preferences){
                builder.addHeader("Cookie", cookie);
                Log.v("OkHttp", "Adding Header: " + cookie);
            }
        }
        return chain.proceed(builder.build());
    }
}
