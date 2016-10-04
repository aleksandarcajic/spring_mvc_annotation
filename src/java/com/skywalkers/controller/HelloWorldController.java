/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.controller;

import com.skywalkers.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Aleksandar
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        
        Greeting myGreeting = new Greeting();
        myGreeting.setText("Test greeting!!!");
        myGreeting.setAdditionalText("Additional greeting text!!!");
        myGreeting.setYear(2016);
        
        model.addAttribute("greeting", myGreeting);
        return "welcome";
    }
}
