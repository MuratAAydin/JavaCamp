package com.company.core.concretes;

import com.company.core.abstracts.AuthServices;
import com.company.google.GoogleAuth;

public class GoogleAuthAdapter implements AuthServices {
    @Override
    public void registerWithAuth(String email, String password) {
        GoogleAuth googleAuth = new GoogleAuth();
        googleAuth.register(email, password);
    }

    @Override
    public void logInWithAuth(String email, String password) {
        GoogleAuth googleAuth = new GoogleAuth();
        googleAuth.login(email, password);
    }
}
