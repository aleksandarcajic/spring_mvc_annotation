/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.service;

import com.skywalkers.model.Greeting;
import org.springframework.stereotype.Service;

/**
 * Greeting service implementation
 * @author aleksandar
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHello() {
        return "Test greeting from Service";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAdditional() {
        return "Additional greeting text!!!";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Greeting getGreeting() {
        Greeting myGreeting = new Greeting();
        myGreeting.setText(this.getHello());
        myGreeting.setAdditionalText(this.getAdditional());
        myGreeting.setYear(2016);
        return myGreeting;
    }
    
}
