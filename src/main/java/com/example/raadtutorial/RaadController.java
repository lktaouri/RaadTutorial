package com.example.raadtutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaadController {
    @RequestMapping("/Hello")
    public String hello() {
        return "Helo";
    }

    @RequestMapping("/random")
    public int num(){
        return 4;
    }
}
