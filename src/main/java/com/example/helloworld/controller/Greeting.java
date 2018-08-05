package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "greeting")
public class Greeting {

    @RequestMapping(value = "/say")
    public String say(){
        return "Hello world folks!";
    }

    @RequestMapping(value = "/error")
    public String error(){
        return "Problems!!!";
    }
}
