package com.vasvince.massageminutecounter.Controller;

import com.vasvince.massageminutecounter.Interface.ISignUpService;
import com.vasvince.massageminutecounter.Model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;

@RestController
public class MainRestController {

    ISignUpService signUpService;

    @Autowired
    public MainRestController(ISignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @RequestMapping("/submit")
    @ResponseBody
    public ModelAndView submitSignUp(Model m,
                                     @RequestParam(name = "typeUserName") String userName,
                                     @RequestParam(name = "typeFirstName") String firstName,
                                     @RequestParam(name = "typeLastName") String lastName,
                                     @RequestParam(name = "typeEmailX") String firstEmail,
                                     @RequestParam(name = "typeEmailY") String secondEmail,
                                     @RequestParam(name = "typePasswordX") String firstPassword,
                                     @RequestParam(name = "typePasswordY") String secondPassword) {

        boolean successfulLogin = true;

        ModelAndView mav = new ModelAndView();
        mav.setViewName("signup");
        Response responseMessage = new Response();


        if (signUpService.userNameIsExist(userName)) {
            responseMessage.setUsername("Username is already taken. Please choose another one!");
            successfulLogin = false;
        } else {
            responseMessage.setUsername("");
        }


        System.out.println("First email: " + firstEmail);
        System.out.println("Second email: " + secondEmail);

        if (signUpService.emailCheck(firstEmail, secondEmail)) {
            if (signUpService.isEmailExist(firstEmail)) {
                responseMessage.setEmail("E-mail already exists. Please choose another one!");
            } else {
                responseMessage.setEmail("");
            }
        } else {
            responseMessage.setEmail("E-mails are not the same! Please check them!");
            successfulLogin = false;
        }

        System.out.println("First password: " + firstPassword);
        System.out.println("Second password: " + secondPassword);

        mav.addObject("responseMessage", responseMessage);

        if (successfulLogin) {
            mav.setViewName("redirect:/main");
        } else {
            mav.setViewName("signup");
        }
        return mav;
    }
}
