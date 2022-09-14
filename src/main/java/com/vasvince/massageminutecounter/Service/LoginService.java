package com.vasvince.massageminutecounter.Service;

import com.vasvince.massageminutecounter.Interface.ILoginService;
import com.vasvince.massageminutecounter.Model.User;

public class LoginService implements ILoginService {
    @Override
    public boolean isUserAuthorized(User user) {
        return false;
    }

    @Override
    public boolean isUserExists(User user) {
        return false;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        return false;
    }
}
