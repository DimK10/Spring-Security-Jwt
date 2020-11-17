package com.dimitriskaitantzidis.springsecurity;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
