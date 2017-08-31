package com.jorgehernandezramirez.spring.springcloud.controller;

import com.jorgehernandezramirez.spring.springcloud.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ping")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TestFeign testFeign;

    public TestController(){
        //For Spring
    }

    @RequestMapping
    public String doAlive() {
        return "Alive!";
    }

    @RequestMapping("/rest")
    public String doRestAlive() {
        return new RestTemplate().getForObject("http://localhost:8080/ping", String.class);
    }

    @RequestMapping("/rest/ribbon")
    public String doRestAliveUsingEurekaAndRibbon() {
        return restTemplate.getForObject("http://springcloudwebtest/ping", String.class);
    }

    @RequestMapping("/rest/feign")
    public String doRestAliveUsingFeign() {
        return testFeign.doAlive();
    }
}