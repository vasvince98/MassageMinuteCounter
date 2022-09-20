package com.vasvince.massageminutecounter.Interface;

import com.vasvince.massageminutecounter.Model.User;

public interface ISignUpService {
    boolean emailCheck(String firstEmail, String secondEmail);
    boolean isEmailExist(String email);
    boolean checkPasswordIsSame(String firstPassword, String secondPassword);
    boolean userNameIsExist(String userName);
    void createNewUser(User user);
    String deleteUserById(int id);
    String deleteAllUser();
}
