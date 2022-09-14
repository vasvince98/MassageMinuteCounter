package com.vasvince.massageminutecounter.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class MainRestController {
    @RequestMapping("/submit")
    @ResponseBody
    public RedirectView submitSignUp(Model m) {


        return new RedirectView("http://localhost:8080/signup");
    }
}
