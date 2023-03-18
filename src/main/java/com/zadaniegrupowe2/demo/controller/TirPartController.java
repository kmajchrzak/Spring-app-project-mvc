package com.zadaniegrupowe2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TirPartController {
    @RequestMapping(path = "/brows-tirpart", method = RequestMethod.GET)
    public ModelAndView getPlanetForm(){
        return new ModelAndView(("brows-tirpart.html"));
    }

}
