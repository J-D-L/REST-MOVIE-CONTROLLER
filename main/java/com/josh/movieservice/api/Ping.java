package com.josh.movieservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Ping
{
    @GetMapping(value = "/ping")
    public String hello(){
       return "I am running";
    }
}
