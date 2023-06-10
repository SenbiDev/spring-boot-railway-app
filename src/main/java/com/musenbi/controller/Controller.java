package com.musenbi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    ResponseEntity<String> index() {
        return ResponseEntity.ok("Welcome to Java Spring Boot");
    }
}
