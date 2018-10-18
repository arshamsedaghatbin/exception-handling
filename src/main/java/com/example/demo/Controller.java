package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class Controller {


    @PostMapping
    private String test(@RequestBody Test test) {

        System.out.println(test);
        throw new KianCreditBusinessException("invalid");

    }


}
