package fragmentdemo.fujisoft.com.catchexception;

import android.app.Application;

/**
 * Created by 860617010 on 2018/2/23.
 */

public class MyApplication extends Application {
    private static MyApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        //在这里为应用设置异常处理程序，然后我们的程序才能捕获未处理的异常
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }

    public static MyApplication getInstance() {
        return sInstance;
    }
}
