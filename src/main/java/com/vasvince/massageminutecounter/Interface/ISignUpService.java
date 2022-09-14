package com.vasvince.massageminutecounter.Interface;

import com.vasvince.massageminutecounter.Model.User;

public interface ISignUpService {
    boolean checkEmailExistence(String email);
    boolean checkEmailIsSame(String email);
    boolean checkPasswordIsSame(String password);
    boolean userNameIsExist(String userName);
    String createNewUser(User user);
    String deleteUser(User user);
    String deleteAllUser(User user);
}
