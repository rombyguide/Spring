package ru.blino.springcore.genres;

import ru.blino.springcore.Music;

/**
 * @author Roman Blinov
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}