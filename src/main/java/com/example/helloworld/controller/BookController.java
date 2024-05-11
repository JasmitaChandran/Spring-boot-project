package com.example.helloworld.controller;

import com.example.helloworld.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//@RestController
////base url
//@RequestMapping("/api")
//public class BookController {
//
//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello";
//    }
//
//    //Give multiple URL (it would work same for /api/book ,/api/java) --> both will open same page
//    //method = RequestMethod.GET (default http method --> GET(we can also use put,delete,post)
//    @RequestMapping(value={"/book","/java"},
//            method = RequestMethod.GET,
//            //tells the rest api that produce the output in json/xml format
//            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
//            //tells the rest api to consume the data in json/sml format
//            consumes ={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
//    )
//    public Book getBook(){
//        Book book = new Book(1,"Java","Learn core java");
//        return book;
//
//
//    }
//}

@RestController
public class BookController{

    @GetMapping(value={"/book","/java"})
    public Book getBook(){
        Book book = new Book(1,"Java","Learn core java");
        return book;
    }

    //Post Mapping (using @ResponseStatus)
//    @PostMapping(value="/book/create",
//                 consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(value= HttpStatus.CREATED)
//    public Book createBook(@RequestBody Book book){
//        System.out.println(book.getId());
//        System.out.println(book.getTitle());
//        System.out.println(book.getDescription());
//        return book;
//    }

    //Post Mapping (using ResponseEntity)
    @PostMapping(value="/book/create",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

}


