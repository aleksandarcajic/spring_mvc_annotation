/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.service;

import com.skywalkers.model.Greeting;

/**
 * Greeting Service
 * @author aleksandar
 */
public interface GreetingService {
    
    /**
     * Get hello message
     * @return 
     */
    String getHello();
    
    /**
     * Get additional message
     * @return 
     */
    String getAdditional();
    
    /**
     * Get Greeting module
     * @return 
     */
    Greeting getGreeting();
    
}
