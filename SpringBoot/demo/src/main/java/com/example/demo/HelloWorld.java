package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class HelloWorld {
    @RequestMapping("world")
    public String ControllHelloWorld(){
        return "Hello SpringBoot";
    }
    
}