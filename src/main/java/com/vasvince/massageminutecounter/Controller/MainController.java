package com.vasvince.massageminutecounter.Controller;

import com.vasvince.massageminutecounter.Interface.IMassageService;
import com.vasvince.massageminutecounter.Model.Minute;
import com.vasvince.massageminutecounter.Model.Response;
import com.vasvince.massageminutecounter.Repository.MassageRepository;
import org.h2.engine.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

    private final IMassageService massageService;
    private final MassageRepository massageRepository;

    @Autowired
    public MainController(IMassageService massageService, MassageRepository massageRepository) {
        this.massageService = massageService;
        this.massageRepository = massageRepository;
    }

    @RequestMapping ("/main")
    public String main(Model m) {
        m.addAttribute("minutes", massageRepository.findFirstByOrderByIdDesc());
        return "index";
    }

    @RequestMapping("/removeminutes")
    public String removeMinutes(Model m, @RequestParam(value = "minutesRemove") int minutes) {
        massageService.removeMinutes(minutes, null);
        m.addAttribute("minutes", massageRepository.findFirstByOrderByIdDesc());
        return "index";
    }

    @RequestMapping("/addminutes")
    public String addMinutes(Model m, @RequestParam(value = "minutesAdd") int minutes) {
        massageService.addMinutes(minutes, null);
        m.addAttribute("minutes", massageRepository.findFirstByOrderByIdDesc());
        return "index";
    }

    @RequestMapping("/signup")
    public ModelAndView signUp() {
        Response responseMessage = new Response();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("signup");
        mav.addObject("responseMessage", responseMessage);
        return mav;
    }


}
