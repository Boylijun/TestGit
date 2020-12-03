package com.yzl.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping("/index1")
    public String sayHello() throws InterruptedException {

        return "index2";
    }
    @RequestMapping("/index2")
    public String sayHello2() throws InterruptedException {

        return "index3";
    }
}
