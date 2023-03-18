package com.zadaniegrupowe2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping(path = "/welcome-page.html", method = RequestMethod.GET)
    public ModelAndView getWelcomePage(){
        ModelAndView modelAndView = new ModelAndView("welcome-page.html");
        return modelAndView;
    }
}
