package com.danmachi.sounandesuka.data.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.danmachi.sounandesuka.data.model.User;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.FAIL)
    void addUser(User... users);

    @Query("SELECT * FROM user WHERE username = :username AND password = :password")
    LiveData<User> login(String username, String password);
}
