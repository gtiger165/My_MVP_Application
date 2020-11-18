package com.example.mymvpapplication.data.repo;

import com.example.mymvpapplication.data.model.User;

public interface LoginRepository {
    User getUser();
    void saveUser(User user);
}
