package com.jorgehernandezramirez.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.jorgehernandezramirez.spring.springcloud.feign")
public class Application {

    public Application(){
        //For Spring
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}