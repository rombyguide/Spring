package ru.blino.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Roman Blinov
 */
@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic() {
        System.out.println("Мелодия: " + name.concat("\n") + "Громкость: " + volume);
        return "Playing: " + music1.getSong().concat(", ") +
                music2.getSong().concat(", ") +
                music3.getSong();
    }
}