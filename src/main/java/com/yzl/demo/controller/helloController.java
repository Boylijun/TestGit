package com.yzl.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping("/index1")
    public String sayHello() throws InterruptedException {

        System.out.println(prop.getParamFromProp("password"));

        return "index1";
    }
}
