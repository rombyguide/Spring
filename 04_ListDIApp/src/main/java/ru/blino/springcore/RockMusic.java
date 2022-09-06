package ru.blino.springcore;

/**
 * @author Roman Blinov
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}