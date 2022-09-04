package com.vasvince.massageminutecounter;

import com.vasvince.massageminutecounter.Model.Massage;
import com.vasvince.massageminutecounter.Repository.MassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.spring5.util.SpringRequestUtils;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
