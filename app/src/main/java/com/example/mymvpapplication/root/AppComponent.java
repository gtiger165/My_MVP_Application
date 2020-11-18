package com.example.mymvpapplication.root;

import com.example.mymvpapplication.login.LoginModule;
import com.example.mymvpapplication.login.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
