package com.example.helloworld.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Scope -- singleton, Prototype
//Singleton - only one instance is created and shared across the application
//Prototype - a new instance of bean is created every time, it is requested.

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Prototype Bean ..........");
    }
}
