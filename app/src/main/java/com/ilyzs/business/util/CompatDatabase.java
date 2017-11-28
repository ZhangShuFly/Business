package com.ilyzs.business.util;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.ilyzs.business.bean.User;
import com.ilyzs.business.dao.UserDao;

/**
 * Created by zhangshu on 2017/11/21.
 */

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class CompatDatabase extends RoomDatabase {

    public abstract UserDao userDao();
}
