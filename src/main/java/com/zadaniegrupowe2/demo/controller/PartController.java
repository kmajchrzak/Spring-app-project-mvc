package com.zadaniegrupowe2.demo.controller;

import com.zadaniegrupowe2.demo.entity.PartType;
import com.zadaniegrupowe2.demo.exception.PartServiceException;
import com.zadaniegrupowe2.demo.request.AddPartRequest;
import com.zadaniegrupowe2.demo.service.PartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PartController {

    private PartService partService;

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @RequestMapping(path = "/add-parts", method = RequestMethod.GET)
    public ModelAndView getPartForm(){
        return new ModelAndView(("add-parts.html"));
}

   @PostMapping("/add-parts")
    public String createPart(@RequestParam String name,
                               @RequestParam double price,
                               @RequestParam(name = "part_type") PartType partType,
                               Model model){
        try {
            partService.addPart(new AddPartRequest(name, price, partType));
            model.addAttribute("message", "Dodano część o nazwie: " + name);
        } catch (PartServiceException e) {
            model.addAttribute("message", e.getMessage());
        }
        return "welcome-page";

    }


}
