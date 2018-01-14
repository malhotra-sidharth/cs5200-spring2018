package edu.northeastern.cs5200.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // RestAPI for getting output as String
    @RequestMapping("/api/hello/string")
    public String sayHello() {
        return "Hello Sidharth Malhotra!!";
    }

    // Rest Api for getting output as JSON
    @RequestMapping("/api/hello/object")
    public HelloObject sayHelloObject() {
        HelloObject obj = new HelloObject("Hello Sidharth Malhotra!!");
        return obj;
    }
}
