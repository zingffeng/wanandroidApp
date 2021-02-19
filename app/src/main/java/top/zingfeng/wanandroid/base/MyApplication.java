package top.zingfeng.wanandroid.base;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author zingfeng
 * @date On 2021/2/10
 */
public class MyApplication extends Application {

    private static Context mCtx;

    @Override
    public void onCreate() {
        super.onCreate();
        /*
            打印日志
         */
        ARouter.openLog();

        /*
            开启调试
         */
        ARouter.openDebug();
        /*
            初始化
         */
        ARouter.init(this);

        MyApplication.mCtx = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.mCtx;
    }
}
