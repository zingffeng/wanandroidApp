package top.zingfeng.wanandroid.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import top.zingfeng.wanandroid.network.config.AddCookiesInterceptor;
import top.zingfeng.wanandroid.network.config.ReceivedCookiesInterceptor;

/**
 * @author zingfeng
 * @date On 2021/2/9
 */
public class BaseRetrofit {

    public static final String BASE_URL = "https://www.wanandroid.com/";
    private static Retrofit retrofit;
    private static OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new AddCookiesInterceptor())
            .addInterceptor(new ReceivedCookiesInterceptor())
            .build();

    private BaseRetrofit(){}

    public static synchronized Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())

                    .client(client)
                    .build();
        }
        return retrofit;
    }
}
