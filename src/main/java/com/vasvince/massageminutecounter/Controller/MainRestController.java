package com.vasvince.massageminutecounter.Controller;

import com.vasvince.massageminutecounter.Interface.ISignUpService;
import com.vasvince.massageminutecounter.Model.Response;
import com.vasvince.massageminutecounter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainRestController {

    ISignUpService signUpService;

    @Autowired
    public MainRestController(ISignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @RequestMapping("/submitsignup")
    @ResponseBody
    public ModelAndView submitSignUp(Model m,
                                     @RequestParam(name = "typeUserName") String userName,
                                     @RequestParam(name = "typeFirstName") String firstName,
                                     @RequestParam(name = "typeLastName") String lastName,
                                     @RequestParam(name = "typeEmailX") String firstEmail,
                                     @RequestParam(name = "typeEmailY") String secondEmail,
                                     @RequestParam(name = "typePasswordX") String firstPassword,
                                     @RequestParam(name = "typePasswordY") String secondPassword) {


        //todo: business logic -> service
        boolean successfulSignup = true;

        //Model and view init
        ModelAndView mav = new ModelAndView();
        mav.setViewName("signup");
        Response responseMessage = new Response();


        //Username check
        if (signUpService.userNameIsExist(userName)) {
            responseMessage.setUsername("Username is already taken. Please choose another one!");
            successfulSignup = false;
        } else {
            responseMessage.setUsername("");
        }

        //Email check
        if (signUpService.emailCheck(firstEmail, secondEmail)) {
            if (signUpService.isEmailExist(firstEmail)) {
                responseMessage.setEmail("E-mail already exists. Please choose another one!");
            } else {
                responseMessage.setEmail("");
            }
        } else {
            responseMessage.setEmail("E-mails are not the same! Please check them!");
            successfulSignup = false;
        }


        //Password check
        if (signUpService.checkPasswordIsSame(firstPassword, secondPassword)) {
            responseMessage.setPassWord("");
        } else {
            responseMessage.setPassWord("Passwords must be the same! Please check them!");
            successfulSignup = false;
        }



        mav.addObject("responseMessage", responseMessage);

        if (successfulSignup) {
            signUpService.createNewUser(new User(userName, lastName, firstName, firstEmail, firstPassword));
            mav.setViewName("redirect:/login");
        } else {
            mav.setViewName("signup");
        }
        return mav;
    }

    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView submitLogin(@RequestParam(name = "loginEmail", required = false) String email,
                                    @RequestParam(name = "loginPassword", required = false) String password) {

        //todo: business logic -> service
        //Model and view init
        ModelAndView mav = new ModelAndView();
        Response responseMessage = new Response();

        //Email check
        if (!signUpService.isEmailExist(email) && email != null) {
            responseMessage.setEmail("E-mail not exists yet! Please sign up!");
        } else {
            responseMessage.setEmail("");
        }


        if (isLoginSuccessful()) {
            mav.setViewName("index");
        } else {
            mav.addObject("responseMessage", responseMessage);
            mav.setViewName("/login");
        }

        return mav;
    }

    private boolean isLoginSuccessful() {
        return false;
    }
}
