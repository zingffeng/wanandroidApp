package top.zingfeng.wanandroid.network.config;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Response;
import top.zingfeng.wanandroid.base.MyApplication;

/**
 * 首次请求
 * @author zingfeng
 * @date On 2021/2/18
 */
public class ReceivedCookiesInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        String setCookies = "Set-Cookie";
        Response originalResponse = chain.proceed(chain.request());
        if (!originalResponse.headers(setCookies).isEmpty()){
            HashSet<String> cookies = new HashSet<>();
            for (String header: originalResponse.headers(setCookies)){
                cookies.add(header);
            }

            SharedPreferences.Editor config = MyApplication.getAppContext().getSharedPreferences("config", Context.MODE_PRIVATE).edit();
            config.putStringSet("cookie", cookies);
            config.commit();
        }
        return originalResponse;
    }
}
