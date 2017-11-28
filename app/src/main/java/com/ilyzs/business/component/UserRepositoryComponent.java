package com.ilyzs.business.component;

import com.ilyzs.business.module.JsonHelperModule;
import com.ilyzs.business.module.UserRepositoryModule;
import com.ilyzs.business.repository.UserRepository;

import dagger.Component;

/**
 * Created by zhangshu on 2017/11/25.
 */

@Component(modules = {UserRepositoryModule.class, JsonHelperModule.class})
public interface UserRepositoryComponent {
        void inject(UserRepository userRepository);
}
