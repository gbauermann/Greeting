package com.bauermann.greeting;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Greeting {
    
	private String phrase;
    private String name;

    public Greeting(String p1, String p2) {
        phrase = p1;
        name = p2;
    }

    public String getPhrase() {
        return phrase;
    }
    
    public String getName() {
        return name;
    }

    public String ToString() {
        return phrase + " " + name;
    }
}