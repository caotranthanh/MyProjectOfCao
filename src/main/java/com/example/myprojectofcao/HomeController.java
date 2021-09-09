package com.example.myprojectofcao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value = "/ping")
    public String ping() {
        return "OK";
    }
}
