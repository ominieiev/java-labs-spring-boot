package com.example.demo.controller;

import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyFirstController {

    @GetMapping("/welcome")
    String getGreetings(@RequestParam String name, Model model) {
        model.addAttribute("guest_name",name);
        return "welcome";
    }

    @GetMapping("/")
    String getGreetings() {
        return "start";
    }
}
