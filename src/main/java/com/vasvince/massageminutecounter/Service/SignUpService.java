package com.vasvince.massageminutecounter.Service;

import com.google.gson.Gson;
import com.vasvince.massageminutecounter.Interface.ISignUpService;
import com.vasvince.massageminutecounter.Model.User;
import com.vasvince.massageminutecounter.Repository.MassageRepository;
import com.vasvince.massageminutecounter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public boolean emailCheck(String firstEmail, String secondEmail) {
        return firstEmail.equals(secondEmail);
    }


    @Override
    public boolean emailCheck(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public boolean isEmailExist(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public boolean checkPasswordIsSame(String firstPassword, String secondPassword) {
        return firstPassword.equals(secondPassword);
    }

    @Override
    public boolean userNameIsExist(String userName) {
        return userRepository.existsByUsername(userName);
    }

    @Override
    public void createNewUser(User user) {
        userRepository.save(user);
    }

    @Override
    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return "User deleted with ID: " + id;
    }

    @Override
    public String deleteAllUser() {
        userRepository.deleteAll();
        return "All users deleted!";
    }

    @Override
    public String getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return new Gson().toJson(users);
    }
}
