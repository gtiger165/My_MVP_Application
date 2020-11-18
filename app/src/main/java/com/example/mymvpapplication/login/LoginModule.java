package com.example.mymvpapplication.login;

import com.example.mymvpapplication.data.model.LoginModel;
import com.example.mymvpapplication.data.repo.LoginRepository;
import com.example.mymvpapplication.data.repo.UserRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {
    @Provides
    public MainActivityMVP.Presenter provideLoginActivityPresenter(MainActivityMVP.Model model) {
        return new MainActivityPresenter(model);
    }

    @Provides
    public MainActivityMVP.Model provideLoginActivityModel(LoginRepository repository) {
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new UserRepository();
    }
}
