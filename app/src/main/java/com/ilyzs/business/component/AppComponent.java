package com.ilyzs.business.component;


import com.ilyzs.business.module.AppModule;

import dagger.Component;

/**
 * Created by zhangshu on 2017/11/23.
 */

@Component(modules = {AppModule.class})
public interface AppComponent {

    UserComponent sub();

}
