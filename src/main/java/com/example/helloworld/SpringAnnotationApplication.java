package com.example.helloworld;

import com.example.helloworld.LazyLoader.LazyLoader;
import com.example.helloworld.Repository.MyRepository;
import com.example.helloworld.controller.MyController;
import com.example.helloworld.controller.PizzaController;
import com.example.helloworld.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

    public static void main(String[] args) {

        //Run method returns --> Returns Application Context object
        //Application context acts as a spring IOC container
        var context =  SpringApplication.run(SpringAnnotationApplication.class, args);

//        PizzaController hwc = context.getBean(PizzaController.class);
//        System.out.println(hwc.getPizza());

        //@Controller, @Service, @Repository are specialised classes of @Component.
        //It is derived from @Component.

        MyController controller = context.getBean(MyController.class);
        System.out.println(controller.hello());

        MyRepository repository = context.getBean(MyRepository.class);
        System.out.println(repository.hello());

        MyService service = context.getBean(MyService.class);
        System.out.println(service.hello());

        //   Lazy loader
        //   On startup, Spring creates beans of the application context.
       //    But if we don’t want to create beans at start, and wants to create bean lazily on demand in between, then @Lazy is used.

             LazyLoader lazy = context.getBean(LazyLoader.class);

    }

}
