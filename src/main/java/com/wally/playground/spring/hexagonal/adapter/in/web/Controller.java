package com.wally.playground.spring.hexagonal.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
