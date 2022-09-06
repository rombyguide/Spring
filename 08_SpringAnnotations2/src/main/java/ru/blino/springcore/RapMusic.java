package ru.blino.springcore;

import org.springframework.stereotype.Component;

/**
 * @author Roman Blinov
 */

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "99 problems";
    }
}
