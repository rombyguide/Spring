package ru.blino.springcore;

import org.springframework.stereotype.Component;

/**
 * @author Roman Blinov
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}