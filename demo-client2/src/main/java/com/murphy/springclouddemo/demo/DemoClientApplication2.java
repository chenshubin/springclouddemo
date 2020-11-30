package com.murphy.springclouddemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoClientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(DemoClientApplication2.class, args);
    }

}
