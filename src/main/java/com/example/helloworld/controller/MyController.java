package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){

        return "Controller hello";

    }

}
