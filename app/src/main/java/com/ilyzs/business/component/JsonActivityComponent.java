package com.ilyzs.business.component;

import com.ilyzs.business.activity.JsonActivity;
import com.ilyzs.business.module.JsonHelperModule;

import dagger.Component;

/**
 * Created by zhangshu on 2017/11/25.
 */

@Component(modules = {JsonHelperModule.class})
public interface JsonActivityComponent{
    void inject(JsonActivity jsonActivity);
}
