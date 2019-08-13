package com.danmachi.sounandesuka.view;

import com.danmachi.sounandesuka.data.model.User;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
