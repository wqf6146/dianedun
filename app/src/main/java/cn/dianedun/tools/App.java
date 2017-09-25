package cn.dianedun.tools;

import android.app.Application;


import com.videogo.openapi.EZOpenSDK;
import org.xutils.BuildConfig;
import org.xutils.x;

/**
 * Created by Administrator on 2017/9/2.
 */

public class App extends Application {
    private static App mInstance;

    private String token;
    private String isAdmin;

    public static String AppKey = "0f74e3ed04794788a1b2ac9e45109031";
    public static String AppSecret = "53f55b1e13a13452dbb078fd2ea6fcae";
    public static EZOpenSDK getOpenSDK() {
        return EZOpenSDK.getInstance();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        initSDK();
    }

    private void initSDK() {
        {
            /**
             * sdk日志开关，正式发布需要去掉
             */
            EZOpenSDK.showSDKLog(true);

            EZOpenSDK.enableP2P(false);

            EZOpenSDK.initLib(this, AppKey, "");
        }
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }

    public static App getInstance() {
        return mInstance;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

}

