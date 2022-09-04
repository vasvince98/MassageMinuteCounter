package com.vasvince.massageminutecounter.Interface;

import com.vasvince.massageminutecounter.Model.User;

public interface IMassageService {
    int addMinutes(int minutes, User user);
    int removeMinutes(int minutes, User user);
}
