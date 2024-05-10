package com.example.helloworld.controller;

import com.example.helloworld.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@RestController
//public class PizzaController {
//
//    @GetMapping("/hello")
//    public String sendGreetings() {
//        return "Hello, World!";
//    }
//
// }

//********** INTRO TO ANNOTATIONS **************

//*** @Component****
// It tells Spring IOC container to automatically create Spring Beans for the class and manage it.
// We don't need to manually create the object

//@Component
//public class PizzaController {
//    public String getPizaa() {
//
//        return "Pizza";
//
//    }
//}

//*** @Autowired****

@Component
public class PizzaController {

//@Autowired --> Used to inject the dependency using constructor injection, setter injection, or field injection

    //Field Injection
    @Autowired
    private VegPizza vegPizza;


    //Constructor Injection
//    @Autowired
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    //Setter Injection
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizaa() {
        return vegPizza.getPizza();
    }
}


