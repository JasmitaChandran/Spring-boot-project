package com.example.helloworld.config;

import com.example.helloworld.controller.PizzaController;
import com.example.helloworld.service.NonVegPizza;
import com.example.helloworld.service.Pizza;
import com.example.helloworld.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

 //Java Based Configuration --> @Bean
//    —> It is Java Based Configuration.
//—> We use @Bean annotation on method, and @Configuration for that particular class, where @Bean methods are mentioned.
// —> Here we don’t use @Component to automatically create spring bean for particular class and @Autowired to automatically inject dependencies.
// —> We explicitly define the object using new keyword, and annotate with @Bean , so that it can manage the object.
//—> In annotation based configuration (@Component, @Autowired) we don’t write new keyword as it automatically create spring bean for particular class.
//    But in Java based configuration (@Configuration, @Bean) we need to write new keyword explicitly, to define the object and annotate with @Bean , so that it can manage the object.

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    //init and destroy in @Bean
   @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(vegPizza());
    }
}
