package com.danmachi.sounandesuka.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

@Entity(tableName = "user")
public class User {

    @PrimaryKey
    @NonNull
    private String username;
    private String nane, password;

    public User(String username, String nane, String password) {
        this.username = username;
        this.nane = nane;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
