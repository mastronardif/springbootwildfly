package com.mastertheboss.springboot.springbootwildfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.*;

// Spring Boot 2.x
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// Spring Boot 1.x
//import org.springframework.boot.web.support.SpringBootServletInitializer;
 
@SpringBootApplication
public class SpringbootwildflyApplication extends SpringBootServletInitializer {
 
    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
 
    private static Class<SpringbootwildflyApplication> applicationClass = SpringbootwildflyApplication.class;
}
 
@RestController
class HelloController {
 
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
 
        return "Hi (34)" + name + " !";
 
    }

    @GetMapping("/")
    public String helloRoot(@RequestParam(required = false, defaultValue = "Guest") String name) {
        return "<html><body><h1>Hi " + name + "!</h1></body></html>";
    }
}
