package frc.team9611.clients.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/")
    public String apiRoot() {
        return "Hello world!";
    }

}
