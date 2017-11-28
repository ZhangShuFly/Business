package com.ilyzs.business.component;

import com.ilyzs.business.module.UserModule;
import com.ilyzs.business.viewmodel.UserProfileViewModel;

import dagger.Subcomponent;

/**
 * Created by zhangshu on 2017/11/23.
 */

@Subcomponent(modules = {UserModule.class})
public interface UserComponent {

    void inject(UserProfileViewModel viewModel);
}
