package com.ras.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")  
public class TestController {
	
	@RequestMapping("/test")  
    String test() {  
        return "Spring Boot Test!";  
    }  
}
