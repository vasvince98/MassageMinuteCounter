package com.vasvince.massageminutecounter.Controller;


import com.vasvince.massageminutecounter.Exceptions.UserNotFoundException;
import com.vasvince.massageminutecounter.Interface.ISignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final ISignUpService signUpService;

    @Autowired
    public AdminController(ISignUpService signUpService) {
        this.signUpService = signUpService;
    }



    @GetMapping("/deleteuser/{userID}")
    public void deleteUserById(@PathVariable int userID) {
        try {
            signUpService.deleteUserById(userID);
        } catch (Exception e) {
            throw new UserNotFoundException("User not found with provided ID!");
        }
    }

    @GetMapping("/getallusers")
    public String getAllUsers() {
        return signUpService.getAllUsers();
    }
}
