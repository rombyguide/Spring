package ru.blino.springcore.genres;

import ru.blino.springcore.Music;

/**
 * @author Roman Blinov
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}