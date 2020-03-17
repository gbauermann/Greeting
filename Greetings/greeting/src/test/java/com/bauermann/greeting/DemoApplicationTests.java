package com.bauermann.greeting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private GreetingService greetingService;

	@Test
	public void testGreetingService() {
		assertEquals(
			new Greeting("Hello", "Gabriel").ToString(), 
			greetingService.helloGreeting("Gabriel").ToString());
	}

}
