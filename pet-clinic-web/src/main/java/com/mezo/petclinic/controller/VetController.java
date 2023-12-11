package com.mezo.petclinic.controller;


import com.mezo.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vet")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/"})
    String vet(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet";
    }
}


