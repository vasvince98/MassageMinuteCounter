package com.vasvince.massageminutecounter.Controller;

import com.vasvince.massageminutecounter.Exceptions.OwnError;
import com.vasvince.massageminutecounter.Exceptions.UserNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({UserNotFoundException.class})
    public String userNotFoundException(Model m) {
        OwnError error = new OwnError("User not found with the provided id!");
        m.addAttribute("error", error);
        return "error";
    }
}
