package com.sosereyboth.myapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping
    public String hello(){
        return "Welcome to My API";
    }
}
