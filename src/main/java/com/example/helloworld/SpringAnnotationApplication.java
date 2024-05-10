package com.example.helloworld;

import com.example.helloworld.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

    public static void main(String[] args) {

        //Run method returns --> Returns Application Context object
        //Application context acts as a spring IOC container
      var context =  SpringApplication.run(SpringAnnotationApplication.class, args);
      PizzaController hwc = context.getBean(PizzaController.class);
        System.out.println(hwc.getPizaa());
    }

}
