package com.murphy.springclouddemo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/serviceHi")
public class ServiceHi {


    @Value("${server.port}")
    String port;


    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;

    }

}
