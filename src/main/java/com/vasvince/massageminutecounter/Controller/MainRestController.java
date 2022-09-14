package com.vasvince.massageminutecounter.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class MainRestController {
    @RequestMapping("/submit")
    @ResponseBody
    public RedirectView submitSignUp(Model m,
                                     @RequestParam(name = "typeUserName") String userName,
                                     @RequestParam(name = "typeFirstName") String firstName,
                                     @RequestParam(name = "typeLastName") String lastName,
                                     @RequestParam(name = "typeEmailX") String firstEmail,
                                     @RequestParam(name = "typeEmailY") String secondEmail,
                                     @RequestParam(name = "typePasswordX") String firstPassword,
                                     @RequestParam(name = "typePasswordY") String secondPassword) {
        System.out.println("Username: " + userName);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("First email: " + firstEmail);
        System.out.println("Second email: " + secondEmail);
        System.out.println("First password: " + firstPassword);
        System.out.println("Second password: " + secondPassword);
        return new RedirectView("http://localhost:8080/signup");
    }
}
