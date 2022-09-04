package com.vasvince.massageminutecounter.Controller;

import com.vasvince.massageminutecounter.Interface.IMassageService;
import com.vasvince.massageminutecounter.Repository.MassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private final IMassageService massageService;
    private MassageRepository massageRepository;

    @Autowired
    public MainController(IMassageService massageService, MassageRepository massageRepository) {
        this.massageService = massageService;
        this.massageRepository = massageRepository;
    }

    @RequestMapping("/")
    public String login(Model m) {
        return "login";
    }

    @RequestMapping ("/main")
    public String main(Model m) {
        m.addAttribute("minutes", massageRepository.findByaction("START"));
        return "index";
    }
}
