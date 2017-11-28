package com.ilyzs.business.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.ilyzs.business.bean.User;

/**
 * Created by zhangshu on 2017/11/21.
 */
@Dao
public interface UserDao {

    @Insert(onConflict= OnConflictStrategy.REPLACE)
    void save(User user);

    @Query("select * from User where id = :userId")
    LiveData<User> load(String userId);

}
