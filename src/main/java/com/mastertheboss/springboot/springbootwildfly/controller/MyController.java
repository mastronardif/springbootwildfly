/**
 * 
 */
package com.mastertheboss.springboot.springbootwildfly.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Swathi
 *
 */
@RestController
public class MyController  {

 @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    @RequestMapping(value = "/file", method = RequestMethod.GET)
    @ResponseBody
    public String getIndexHtml() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:static/index.html");
        try (java.io.InputStream inputStream = resource.getInputStream()) {
            java.util.Scanner scanner = new java.util.Scanner(inputStream, StandardCharsets.UTF_8.name());
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        }
    }

}
