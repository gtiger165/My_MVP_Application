package com.example.mymvpapplication.login;

import com.example.mymvpapplication.data.model.User;

public interface MainActivityMVP {
    interface View{
        String getFirstName();
        String getLastName();

        void showInputError();
        void setFirstName(String firstName);
        void setLastName(String lastName);
        void showUserSavedMessage();
    }

    interface Presenter{
        void setView(View view);
        void loginButtonClicked();
        void getCurrentUser();
    }

    interface Model{
        void createUser(String name, String lastName);
        User getUser();
    }
}
