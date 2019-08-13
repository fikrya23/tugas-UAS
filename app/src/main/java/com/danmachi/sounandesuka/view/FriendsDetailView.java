package com.danmachi.sounandesuka.view;

import com.danmachi.sounandesuka.data.model.Friends;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
