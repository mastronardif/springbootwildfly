//package com.example.blondiebytes.tutuorial.conroller;
package com.mastertheboss.springboot.springbootwildfly.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @RequestMapping(value = "/FUCK", method = RequestMethod.GET)
    public String getGreeting() {
        return "Hi it's me blondibytes and I like pizza";

    }

    String json = """
        [
            {"name": "John", "age": 25},
            {"name": "Frank", "age": 32},
            {"name": "Jane", "age": 30},
            {"name": "Mark", "age": 28}
        ]
    """;

    @GetMapping("/api/data")
    @ResponseBody
    public ResponseEntity<String> getData() {
        // Create the raw JSON array
        //String json = "[{\"name\":\"John\", \"age\":25}, {\"name\":\"Jane\", \"age\":30}, {\"name\":\"Mark\", \"age\":28}]";

        return ResponseEntity.status(HttpStatus.OK).body(json);
    }

}
