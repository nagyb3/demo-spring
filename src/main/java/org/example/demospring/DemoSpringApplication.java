package org.example.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoSpringApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }

    @GetMapping("/hello-world")
    public Map<String, String> helloWorld() {
        Map<String, String> response = new HashMap<>();
        response.put("hello", "world");
        return response;
    }
}