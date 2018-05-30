package com.praktikum.dogodki.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MainController {


    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
 
        return "index";
    }

    @RequestMapping(value = { "/addDogodek" }, method = RequestMethod.GET)
    public String addDogodek(Model model) {
    	
    	
 
 
        return "addDogodek";
    }

}
