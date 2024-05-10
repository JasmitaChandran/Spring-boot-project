package com.example.helloworld.controller;

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

// @Component
// It tells Spring IOC container to automatically create Spring Beans for the class and manage it.
// We don't need to manually create the object

@Component
public class PizzaController {
    public String getPizaa() {

        return "Pizza";

    }
}


