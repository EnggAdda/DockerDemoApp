package com.example.dockerdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DockerDemoAppApplication {

    @GetMapping("/get")
   public String getMessage(){

        return "Welcome to EnggAdda";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoAppApplication.class, args);
    }

}
