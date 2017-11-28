package com.ilyzs.business.module;

import android.content.Context;


import com.ilyzs.business.base.BussinessBaseApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhangshu on 2017/11/23.
 */

@Module
public class AppModule {

    private Context context;

    public AppModule(BussinessBaseApplication application){
        this.context = application;
    }

    @Provides
    public Context providerApplication() {
        return context;
    }
}
