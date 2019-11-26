package de.csbme.mitfahrapp.controller;

import de.csbme.mitfahrapp.controller.menu.Item;
import de.csbme.mitfahrapp.controller.menu.Menu;

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

    private Menu menu;

    public WebController(){
         menu = new Menu( new Item("fa-home",  "/", "Home") );
    }

    /**
     * @Author Felix Meyer
     * Method handling GET requests to the index page.
     * If another handler doesn't add more functionality the JavaDoc may be omitted.
     * @param model Model representing all data that is passed to the Thymeleaf template
     * @param principal Serves information about the logged in user or lack of one
     * @return The thymeleaf template name that should be served
     */
    @GetMapping("/")
    public String showIndex(Model model, Principal principal ){
        model.addAttribute("menu", menu);
        model.addAttribute("title", "Index Page");
        model.addAttribute("hello", "Hello world!");
        return "index";
    }

}