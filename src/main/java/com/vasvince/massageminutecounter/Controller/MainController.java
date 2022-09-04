package com.vasvince.massageminutecounter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/main")
    public String main(Model m, @RequestBody int minutes) {

        return "index";
    }
}
