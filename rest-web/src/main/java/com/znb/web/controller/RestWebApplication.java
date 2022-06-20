package com.znb.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class RestWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestWebApplication.class, args);
    }
    @GetMapping("/demo")
    public String demo(String name) {
        System.out.println("ssss " + name);
        return "hello, " + name + "i am demo";
    }
}
