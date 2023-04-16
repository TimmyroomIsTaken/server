package com.timmyroom.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") // HTTP Get 방식
    public String hello(Model model) {
        model.addAttribute("data", "Timmyroom");
        return "hello";
    }
}