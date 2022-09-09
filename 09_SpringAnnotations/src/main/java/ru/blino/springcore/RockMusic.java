package ru.blino.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Roman Blinov
 */

@Component
@Scope("prototype")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}