package com.mezo.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    String index(){
        return "index";
    }

    @RequestMapping("/oups")
    String notImplemented(){
        return "notImplemented";
    }


}
