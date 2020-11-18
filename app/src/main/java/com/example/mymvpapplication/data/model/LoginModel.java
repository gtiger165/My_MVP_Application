package com.example.mymvpapplication.data.model;

import com.example.mymvpapplication.data.repo.LoginRepository;
import com.example.mymvpapplication.login.MainActivityMVP;

public class LoginModel implements MainActivityMVP.Model {
    private LoginRepository repository;

    public LoginModel(LoginRepository loginRepository) {
        this.repository = loginRepository;
    }

    @Override
    public void createUser(String name, String lastName) {
        repository.saveUser(new User(name, lastName));
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
