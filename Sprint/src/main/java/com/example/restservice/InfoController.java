package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InfoController {
    private static final String template = "Membership Info %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/info")
    public Info greeting(@RequestParam(value = "Name", defaultValue = "World") String name) {
        return new Info();//(counter.incrementAndGet(), String.format(template, name));
    }

}
