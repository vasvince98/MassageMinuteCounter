package com.vasvince.massageminutecounter.Interface;

import com.vasvince.massageminutecounter.Model.User;

public interface ILoginService {
    boolean isUserAuthorized(User user);
    boolean isUserExists(User user);
    boolean isPasswordCorrect(String password);
}
