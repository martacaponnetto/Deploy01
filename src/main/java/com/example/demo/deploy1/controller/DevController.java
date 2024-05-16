package com.example.demo.deploy1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class DevController {

    @GetMapping("/name")
    public String getName() {
        return "Marta";
    }
}