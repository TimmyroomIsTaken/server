package com.timmyroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") // localhost:8080들어오면 딱 여기로!
    public String home() {
        return "home";
    }
}
