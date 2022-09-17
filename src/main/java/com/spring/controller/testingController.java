package com.spring.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//http://localhost:8080/
@RestController
@RequestMapping("/api")

//http://localhost:8080/api
public class testingController {

    @Value("${admin.name}")
    public String name;

    @RequestMapping("/name")
//http://localhost:9090/api/name
    public String getName(){

        return ("i am ayham alkhalaf" + name);
    }

    @RequestMapping("/age")
    //http://localhost:9090/api/age
    public String getAge(){

        return ("27");
    }

    @RequestMapping("/phone")
    //http://localhost:9090/api/phone
    public String getPhone(){

        return ("99178131321231");
    }

    @RequestMapping("/address")
    //http://localhost:9090/api/adress
    public String getAddress(){

        return ("syria");
    }

}
