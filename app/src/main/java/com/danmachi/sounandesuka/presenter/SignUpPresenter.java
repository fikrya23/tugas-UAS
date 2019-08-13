package com.danmachi.sounandesuka.presenter;

import android.content.Context;
import android.widget.EditText;

import com.danmachi.sounandesuka.data.model.User;
import com.danmachi.sounandesuka.data.repo.UserRepository;
import com.danmachi.sounandesuka.view.SignUpView;

// 13-08-2019
// Fikri Ahmad Ramdhan
// 10116362 IF-8

public class SignUpPresenter {

    private SignUpView view;
    private UserRepository repo;

    public SignUpPresenter(Context context, SignUpView view) {
        this.view = view;
        repo = new UserRepository(context);
    }

    public void signUp(User user) {
        try {
            repo.insertUser(user);
            view.signUpSuccess();
        } catch (Exception ex) {
            view.signUpFailed();
        }
    }

    public void setError(EditText editText) {
        editText.requestFocus();
        editText.setError("Please fill this box !");
    }

    public void setPassError(EditText editText) {
        editText.requestFocus();
        editText.setError("Password length minimal 8 character !");
    }
}
