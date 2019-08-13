package com.danmachi.sounandesuka.presenter;

import com.danmachi.sounandesuka.view.AboutView;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public class AboutPresenter {

    private AboutView view;

    public AboutPresenter(AboutView view) {
        this.view = view;
    }

    public void selectionView(int tab) {
        if (tab == 0) {
            view.showApp();
        } else {
            view.showCreator();
        }
    }
}
