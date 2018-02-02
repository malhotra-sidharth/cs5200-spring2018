package edu.northeastern.cs5200.controller;

import edu.northeastern.cs5200.entity.HelloObject;
import edu.northeastern.cs5200.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class HelloController implements ErrorController{

    private static final String PATH = "/error";

    @Autowired
    HelloRepository helloRepository;

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

    @RequestMapping("/api/hello/insert")
    public HelloObject insertHelloObject() {
        HelloObject obj = new HelloObject("Hello Sidharth Malhotra!");
        helloRepository.save(obj);
        return obj;
    }

    @RequestMapping("/api/hello/insert/{msg}")
    public HelloObject insertMessage(@PathVariable("msg") String message) {
        HelloObject obj = new HelloObject(message);
        helloRepository.save(obj);
        return obj;
    }

    @RequestMapping("/api/hello/select/all")
    public List<HelloObject> selectAllHelloObjects() {
        return helloRepository.findAll();
    }

    @RequestMapping(PATH)
    public Integer error(HttpServletRequest request, HttpServletResponse response) {
        return response.getStatus();
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
