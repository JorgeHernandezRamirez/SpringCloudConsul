package com.jorgehernandezramirez.spring.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Value("${property}")
    private String property;

    public PropertyController(){
        //For Spring
    }

    @RequestMapping
    public String getProperty() {
        return property;
    }
}