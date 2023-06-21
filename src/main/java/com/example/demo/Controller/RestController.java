package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/home")
    private String home(){
        return "Current Thread : "+ Thread.currentThread().getName() + ". is virtual : "+ Thread.currentThread().isVirtual();
    }
}
