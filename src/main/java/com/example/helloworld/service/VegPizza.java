package com.example.helloworld.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary annotation --> Used to give higher preference to the bean, when multiple beans are there
@Component
@Primary
public class VegPizza implements Pizza {

    @Override
    public String getPizza(){

        return "Veg Pizza";
    }

}
