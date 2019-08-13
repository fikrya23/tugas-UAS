package com.danmachi.sounandesuka.presenter;

import com.danmachi.sounandesuka.view.ContactView;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public class ContactPresenter {

    private ContactView view;

    public ContactPresenter(ContactView view) {
        this.view = view;
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

    public void openTwitter() {
        view.actionTwitter();
    }
}
