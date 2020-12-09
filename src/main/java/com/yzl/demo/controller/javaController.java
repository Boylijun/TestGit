package com.yzl.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class javaController {

    @RequestMapping("/index1")
    public String sayHello() throws InterruptedException {

        return "index2";
    }
}
