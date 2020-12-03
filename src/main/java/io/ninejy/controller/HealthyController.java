package io.ninejy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthyController {
	
    @RequestMapping("/healthy")
    public String index() {
        return "OK\n";
    }
}
