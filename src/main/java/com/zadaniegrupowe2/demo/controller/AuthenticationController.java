package com.zadaniegrupowe2.demo.controller;

import com.zadaniegrupowe2.demo.exception.AuthenticationServiceException;
import com.zadaniegrupowe2.demo.request.RegisterRequest;
import com.zadaniegrupowe2.demo.service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {
    private AuthenticationService service;

    public AuthenticationController(AuthenticationService service) {
        this.service = service;
    }
    @GetMapping("/register")
    public ModelAndView getRegister(){
        RegisterRequest request = new RegisterRequest();
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("request", request);
        return modelAndView;
    }

    @PostMapping("/create-user")
    public ModelAndView createUser(@ModelAttribute("request")RegisterRequest request) {
        System.out.println(request);
        ModelAndView modelAndView = new ModelAndView("welcome-page");
        try {
            service.createUser(request);
        } catch (AuthenticationServiceException e){

        }
        modelAndView.addObject("message", "Konto utworzone");
        return modelAndView;
    }


}
