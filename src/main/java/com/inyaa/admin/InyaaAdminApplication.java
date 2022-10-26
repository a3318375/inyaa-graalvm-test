package com.inyaa.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class InyaaAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(InyaaAdminApplication.class, args);
    }


    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
