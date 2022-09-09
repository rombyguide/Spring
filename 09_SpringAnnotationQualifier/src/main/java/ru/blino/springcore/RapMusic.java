package ru.blino.springcore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roman Blinov
 */
@Component
public class RapMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("99 problems");
        songs.add("Who let the dogs out");
        songs.add("Corazon");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
