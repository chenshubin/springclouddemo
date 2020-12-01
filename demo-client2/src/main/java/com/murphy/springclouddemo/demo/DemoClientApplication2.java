package com.murphy.springclouddemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class DemoClientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(DemoClientApplication2.class, args);
    }


}
