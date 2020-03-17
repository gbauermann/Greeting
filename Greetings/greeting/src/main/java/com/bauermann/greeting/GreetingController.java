package com.bauermann.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * GreetingController
 */
@Controller
public class GreetingController {

@Autowired
private GreetingService greetingService;

    @GetMapping("/hello")
    @ResponseBody
    public Greeting hello(@RequestParam String name) {
        return greetingService.helloGreeting(name);
    }
}