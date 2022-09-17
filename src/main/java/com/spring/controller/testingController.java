package com.spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//http://localhost:8080/
@RestController
@RequestMapping("/api")

//http://localhost:8080/api
public class testingController {


    @RequestMapping("/name")
//http://localhost:8080/api/name
    public String getName(){

        return "i am ayham alkhalaf";
    }
}
