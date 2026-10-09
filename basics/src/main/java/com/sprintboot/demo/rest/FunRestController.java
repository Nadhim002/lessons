package com.sprintboot.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${hello.world}")
    private String helloWorld ;

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello world";
    };

    @GetMapping("/nadhim")
    public String getGroot(){

        return helloWorld ;
    };

}
