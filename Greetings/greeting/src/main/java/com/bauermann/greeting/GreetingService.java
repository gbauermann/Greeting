package com.bauermann.greeting;

import org.springframework.stereotype.Service;

/**
 * GreetingService
 */
@Service
public class GreetingService {

    public Greeting helloGreeting(String name) {
        Greeting greeting = new Greeting("Hello", name);
        return greeting;
    }
}