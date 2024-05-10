package com.example.helloworld.service;

import org.springframework.stereotype.Component;

//@Component
//public class NonVegPizza implements Pizza{
//
//
//    @Override
//    public String getPizza() {
//        return "Non-Veg Pizza";
//    }
//}

//Java based Configuration - @Bean and @Configuration
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "Non-Veg Pizza";
    }
}