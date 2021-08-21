package edu.nyu.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world: get";
    }

    @PostMapping("/hello")
    public String helloPost(String name){
        return "hello world: post -> " + name;
    }
}
