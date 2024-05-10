package com.example.helloworld.controller;

import com.example.helloworld.service.Pizza;
import com.example.helloworld.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

//@Component
//public class PizzaController {
//
////@Autowired --> Used to inject the dependency using constructor injection, setter injection, or field injection
//
//    //Field Injection
//    @Autowired
//    private VegPizza vegPizza;
//
//
//    //** Constructor Injection**
//    // @Autowired
//    // public PizzaController(VegPizza vegPizza) {
//   //  this.vegPizza = vegPizza;
//   //  }
//
//    // ** Setter Injection **
//    // @Autowired
//    // public void setVegPizza(VegPizza vegPizza) {
//    // this.vegPizza = vegPizza;
//    // }
//
//    public String getPizza() {
//        return vegPizza.getPizza();
//    }
//}

////@Qualifier -->is used in conjunction with @Autowired to avoid confusion when we have 2 or more beans configured for same type.
//@Component
//public class PizzaController{
//    Pizza pizza ;
//
//    @Autowired
//    public PizzaController(@Qualifier("vegPizza")Pizza pizza) {
//        this.pizza = pizza;
//    }
//
//    public String getPizza(){
//
//        return pizza.getPizza();
//    }
//}

//@Component
//public class PizzaController{
//    Pizza pizza ;
//
//    @Autowired
//    public PizzaController(Pizza pizza) {
//        this.pizza = pizza;
//    }
//
//    public String getPizza(){
//
//        return pizza.getPizza();
//    }
//}

//Java based Configuration - @Bean and @Configuration
public class PizzaController{
    Pizza pizza ;

    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }
    //init and destroy in @Bean
    public void init(){
        System.out.println("Initialization Logic.......");
    }

    public void destroy(){
        System.out.println("Destruction Logic ...........");
    }
}