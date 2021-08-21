package edu.nyu.wiki.controller;

import edu.nyu.wiki.model.Test;
import edu.nyu.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "hello world: get111222";
    }

    @PostMapping("/hello")
    public String helloPost(String name){
        return "hello world: post -> " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
