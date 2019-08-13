package com.danmachi.sounandesuka.view;

import android.widget.EditText;

import com.danmachi.sounandesuka.data.model.Friends;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public interface AddEditFriendsView {
    void showData();
    void onFriendAdded();
    void onFriendUpdated(Friends friend);
    void showError(EditText et);
    void showFailed(String msg);
}
