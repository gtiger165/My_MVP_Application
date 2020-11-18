package com.example.mymvpapplication.data.repo;

import com.example.mymvpapplication.data.model.User;

public class UserRepository implements LoginRepository{
    private User user;

    @Override
    public User getUser() {
        if (user == null) {
            user = new User("Hirarki", "Wendri");
            user.setId(0);
        }

        return user;
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }

        this.user = user;
    }
}
