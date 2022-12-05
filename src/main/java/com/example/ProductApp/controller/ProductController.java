package com.example.ProductApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Product App Home";
    }

    @GetMapping("/viewAll")
    public String ViewAll(){
        return "Welcome to ViewAll Page";
    }

    @PostMapping("/addProduct")
    public String AddProduct(){
        return "Welcome to Add Product Page";
    }

}
