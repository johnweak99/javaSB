package com.example.javaSB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(){
        return "Hi john 2";
    }

    @RequestMapping(value="/message")
    public String message(){
        return "Congrats you are on the track!";
    }
}
