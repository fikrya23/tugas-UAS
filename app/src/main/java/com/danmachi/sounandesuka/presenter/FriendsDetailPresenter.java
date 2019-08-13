package com.danmachi.sounandesuka.presenter;

import android.content.Context;

import com.danmachi.sounandesuka.data.model.Friends;
import com.danmachi.sounandesuka.data.repo.FriendsRepository;
import com.danmachi.sounandesuka.view.FriendsDetailView;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public class FriendsDetailPresenter {

    private FriendsDetailView view;
    private FriendsRepository repo;

    public FriendsDetailPresenter(Context context, FriendsDetailView view) {
        this.view = view;
        repo = new FriendsRepository(context);
    }

    public void getFriendsDetail(Friends fr) {
        view.showDetail(fr);
    }

    public void makeCall() {
        view.actionCall();
    }

    public void sendEmail() {
        view.actionEmail();
    }

    public void openInstagram() {
        view.actionInstagram();
    }

    public void removeFriend(Friends friend) {
        repo.deleteFriend(friend);
        view.onFriendDeleted();
    }
}
