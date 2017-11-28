package com.ilyzs.business.base;

import com.github.moduth.blockcanary.BlockCanary;
import com.ilyzs.business.component.AppComponent;
import com.ilyzs.business.component.DaggerAppComponent;
import com.ilyzs.business.module.AppModule;
import com.ilyzs.business.util.CompatBaseBlockCanaryContext;
import com.ilyzs.libbase.BaseApplication;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by zhangshu on 2017/11/16.
 */

public class BussinessBaseApplication extends BaseApplication {
    private static AppComponent appComponent;
    private static BussinessBaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
        BlockCanary.install(this, new CompatBaseBlockCanaryContext()).start();
        if(null == instance){
            instance = this;
        }
    }

    public static BussinessBaseApplication get(){
        return instance;
    }

    private void setupAppComponent() {
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppCompontent() {
        if (null == appComponent) {
            setupAppComponent();
        }
        return appComponent;
    }
}
