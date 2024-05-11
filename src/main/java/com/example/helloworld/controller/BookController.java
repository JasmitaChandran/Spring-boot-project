package com.example.helloworld.controller;

import com.example.helloworld.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class BookController {
    @RequestMapping("/book")
    public Book getBook(){
        Book book = new Book(1,"Java","Learn core java");
        return book;
    }
}


