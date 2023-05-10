package com.timmyroom.moyoserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/moyoserver")
    @ResponseBody
    public String index() {
        return "Hello. This is Timmyroom, not Timmy's room";
    }
}
