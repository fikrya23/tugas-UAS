package com.danmachi.sounandesuka.presenter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;

import com.danmachi.sounandesuka.data.model.User;
import com.danmachi.sounandesuka.data.repo.UserRepository;
import com.danmachi.sounandesuka.preference.UserPreference;
import com.danmachi.sounandesuka.view.HomeView;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public class HomePresenter {

    private HomeView view;
    private UserRepository repo;
    private UserPreference prefs;

    public HomePresenter(Context context, HomeView view) {
        this.view = view;
        repo = new UserRepository(context);
        prefs = new UserPreference(context);
    }

    public void getUserData(LifecycleOwner owner) {
        String username = prefs.userLogin();
        String password = prefs.passwordLogin();

        repo.selectUser(username, password).observe(owner, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                view.showUser(user);
            }
        });
    }

    public void signOut() {
        prefs.setIsLogin(null, null);
        view.onSignOut();
    }
}