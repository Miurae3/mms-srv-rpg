package com.miura.mms_srv_rpg.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {
    
    @GetMapping("/")
    public String health(){
        return "TESTE!";
    }

}
