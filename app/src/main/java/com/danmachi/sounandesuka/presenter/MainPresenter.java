package com.danmachi.sounandesuka.presenter;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.danmachi.sounandesuka.preference.UserPreference;
import com.danmachi.sounandesuka.view.MainView;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public class MainPresenter {

    private MainView view;
    private UserPreference prefs;

    public MainPresenter(Context context, MainView view) {
        this.view = view;
        prefs = new UserPreference(context);
    }

    public void isLogin() {
        if (prefs.userLogin() == null) view.toLogin();
    }

    public void addView() {
        view.addView();
    }

    public void changeView(Fragment fragment) {
        view.showView(fragment);
    }
}
