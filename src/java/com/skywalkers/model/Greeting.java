/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.model;

import java.io.Serializable;

/**
 * Greetings model
 * @author Aleksandar
 */
public class Greeting implements Serializable {

    private static final long serialVersionUID = 6882407297826273417L;
    
    private String text;
    private String additionalText;
    private Integer year;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAdditionalText() {
        return additionalText;
    }

    public void setAdditionalText(String additionalText) {
        this.additionalText = additionalText;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
        
}
