/**
 * 
 */
package com.mastertheboss.springboot.springbootwildfly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Swathi
 *
 */
@RestController
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "forward:/index.html";
	}

}
