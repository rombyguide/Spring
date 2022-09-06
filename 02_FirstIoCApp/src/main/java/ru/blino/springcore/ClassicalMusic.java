package ru.blino.springcore;

/**
 * @author Roman Blinov
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}