package com.vasvince.massageminutecounter.Service;

import com.vasvince.massageminutecounter.Interface.ISignUpService;
import com.vasvince.massageminutecounter.Model.User;
import org.springframework.stereotype.Service;

@Service
public class SignUpService implements ISignUpService {

    @Override
    public boolean checkEmailExistence(String email) {
        return false;
    }

    @Override
    public boolean checkEmailIsSame(String email) {
        return false;
    }

    @Override
    public boolean checkPasswordIsSame(String password) {
        return false;
    }

    @Override
    public boolean userNameIsExist(String userName) {
        return false;
    }

    @Override
    public String createNewUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(User user) {
        return null;
    }

    @Override
    public String deleteAllUser(User user) {
        return null;
    }
}
