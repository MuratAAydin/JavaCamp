package com.company.core.abstracts;

public interface AuthServices {
    void registerWithAuth(String email, String password);
    void logInWithAuth(String email, String password);
}


