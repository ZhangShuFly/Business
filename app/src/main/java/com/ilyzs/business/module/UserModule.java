package com.ilyzs.business.module;


import android.content.Context;


import com.ilyzs.business.repository.UserRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhangshu on 2017/11/23.
 */
@Module
public class UserModule {

    @Provides
   public UserRepository providerUserRepository(Context context){
       return new UserRepository(context) ;
   }
}
