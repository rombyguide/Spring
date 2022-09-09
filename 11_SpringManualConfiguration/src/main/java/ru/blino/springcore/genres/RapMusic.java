package ru.blino.springcore.genres;

import ru.blino.springcore.Music;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Roman Blinov
 */
public class RapMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "99 problems";
    }
}
