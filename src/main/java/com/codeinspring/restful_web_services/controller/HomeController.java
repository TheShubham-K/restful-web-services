package com.codeinspring.restful_web_services.controller;

import com.codeinspring.restful_web_services.Bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // hello world
    @GetMapping("/welcome")
    public String home() {
        return "hello word!";
    }

    // hello world bean
    @GetMapping("/welcome-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
}
