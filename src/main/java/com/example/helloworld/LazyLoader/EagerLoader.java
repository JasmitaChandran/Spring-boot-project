package com.example.helloworld.LazyLoader;

import org.springframework.stereotype.Component;

//There are 2 classes EagerLoader class and LazyLoader class.
//—> EagerLoader class eagerly creates class at startup
//—> LazyLoader creates class on demand.
@Component
public class EagerLoader {
    public EagerLoader() {
        System.out.println("EagerLoader............");
    }
}
