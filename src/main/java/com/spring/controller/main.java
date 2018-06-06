package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class main {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
