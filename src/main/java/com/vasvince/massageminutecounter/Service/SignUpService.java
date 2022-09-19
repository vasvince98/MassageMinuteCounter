package com.vasvince.massageminutecounter.Service;

import com.vasvince.massageminutecounter.Interface.ISignUpService;
import com.vasvince.massageminutecounter.Model.User;
import com.vasvince.massageminutecounter.Repository.MassageRepository;
import com.vasvince.massageminutecounter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService implements ISignUpService {

    MassageRepository massageRepository;
    UserRepository userRepository;

    @Autowired
    public SignUpService(MassageRepository massageRepository, UserRepository userRepository) {
        this.massageRepository = massageRepository;
        this.userRepository = userRepository;
    }

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
        return userRepository.existsByUsername(userName);
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
