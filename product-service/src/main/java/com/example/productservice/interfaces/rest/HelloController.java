package com.example.productservice.interfaces.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/")
    String getHello() {
        log.info("Hello was called");
        return "hello";
    }
}
