package com.example.helloworld.controller;

import com.example.helloworld.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @RequestMapping("/book")
    @ResponseBody
    public Book getBook(){

        Book book = new Book(1,"Java","Learn core java");
        return book;

    }
}
