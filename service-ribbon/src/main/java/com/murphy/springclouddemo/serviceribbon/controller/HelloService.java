package com.murphy.springclouddemo.serviceribbon.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "demo-client")
public interface HelloService {


    @RequestMapping(value = "/serviceHi/sayHi", method = RequestMethod.GET)
    public String hiService(String name) ;

}
