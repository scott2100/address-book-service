package ie.scottyoung.addressbookservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}