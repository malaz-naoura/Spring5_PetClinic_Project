package com.mezo.petclinic.controller;


import com.mezo.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/"})
    String owner(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owner";
    }

    @RequestMapping("/find")
    String getFindOwners(){
        return "notImplemented";
    }

}


