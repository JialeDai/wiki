package edu.nyu.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world: get111222";
    }

    @PostMapping("/hello")
    public String helloPost(String name){
        return "hello world: post -> " + name;
    }
}
