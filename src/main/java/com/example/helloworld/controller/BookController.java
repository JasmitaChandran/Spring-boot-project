package com.example.helloworld.controller;

import com.example.helloworld.beans.Book;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

//@Controller
//public class BookController {
//
//    @RequestMapping("/book")
//    @ResponseBody
//    public Book getBook(){
//
//        Book book = new Book(1,"Java","Learn core java");
//        return book;
//
//    }
//}

//Rest Controller --> @Controller + @ResponseBody
//@RestController
//public class BookController {
//    @RequestMapping("/book")
//    public Book getBook(){
//        Book book = new Book(1,"Java","Learn core java");
//        return book;
//    }
//}

@RestController
//base url
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    //Give multiple URL (it would work same for /api/book ,/api/java) --> both will open same page
    //method = RequestMethod.GET (default http method --> GET(we can also use put,delete,post)
    @RequestMapping(value={"/book","/java"},
            method = RequestMethod.GET,
            //tells the rest api that produce the output in json/xml format
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            //tells the rest api to consume the data in json/sml format
            consumes ={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Book getBook(){
        Book book = new Book(1,"Java","Learn core java");
        return book;


    }
}


