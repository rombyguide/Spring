package ru.blino.springcore;

import org.springframework.stereotype.Component;

/**
 * @author Roman Blinov
 */
@Component
public class ClassicalMusic implements Music {
    private void doMyInit() {
        System.out.println("Doing my initialization");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}