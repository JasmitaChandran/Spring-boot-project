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

    //@PutMapping Annotation
    //@Path variable—> used to bind the value of URI template variable ({id}) to the method argument.
    //@ResponseBody —> It is responsible to retrieve the JSON data from the request body, and it would convert this JSON to java object.
@PutMapping(value ="/book/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedbook){
        System.out.println(id);
        System.out.println(updatedbook.getTitle());
        System.out.println(updatedbook.getDescription());
        updatedbook.setId(id);
        return ResponseEntity.ok(updatedbook);
    }

    @DeleteMapping(value="/book/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Book deleted Successfully....");
    }


    //Example of Path Variable
    @GetMapping("/book/{id}/{title}/{description}")
    public ResponseEntity<Book> pathVariableDemo(@PathVariable int id, @PathVariable String title, @PathVariable String description){
        System.out.println(id);
        Book book = new Book();
        book.setId(id);
        book.setDescription(description);
        book.setTitle(title);
        return ResponseEntity.ok(book);
    }
}


