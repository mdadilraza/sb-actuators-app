package com.eidiko.SB_Actuator_App.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeMsg(){
        return "Welcome to eidiko ssytem ....!!!!";
    }
}
