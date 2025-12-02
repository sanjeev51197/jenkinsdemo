package com.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @GetMapping("/message")
    public String getMessage() {
        return "Wow happy to see your learning!";
    }
}
