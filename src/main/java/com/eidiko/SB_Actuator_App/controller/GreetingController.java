package com.eidiko.SB_Actuator_App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet(){
        return "Good Morning ....!!!";
    }
}
