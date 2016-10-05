/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.controller;

import com.skywalkers.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello world controller
 * @author Aleksandar
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
    
    /**
     * Greeting service
     */
    @Autowired
    GreetingService greetingService;
    
    /**
     * Default method
     * @param model
     * @return 
     */
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {        
        model.addAttribute("greeting", greetingService.getGreeting());
        return "welcome";
    }
}
