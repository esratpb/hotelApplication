package djs.team2.hotelApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello world.";
    }
}