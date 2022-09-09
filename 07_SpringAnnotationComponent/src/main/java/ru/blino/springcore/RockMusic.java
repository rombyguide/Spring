package ru.blino.springcore;

import org.springframework.stereotype.Component;

/**
 * @author Roman Blinov
 */

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}