package de.csbme.mitfahrapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.security.Principal;

@Controller
public class WebController implements WebMvcConfigurer {

    private static final Logger log = LoggerFactory.getLogger(WebController.class);

    @GetMapping("/")
    public String showTournamentSelect(Model model, Principal principal){
        model.addAttribute("hello", "Hello world!");
        return "index";
    }

}