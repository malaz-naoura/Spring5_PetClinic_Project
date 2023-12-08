package com.mezo.petclinic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vet")
public class VetController {

    @RequestMapping({"","/"})
    String vet(){
        return "vet";
    }
}


