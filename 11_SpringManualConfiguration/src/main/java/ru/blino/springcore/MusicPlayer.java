package ru.blino.springcore;

import org.springframework.beans.factory.annotation.Value;
import java.util.List;
import java.util.Random;

/**
 * @author Roman Blinov
 */
public class MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong().concat(
                " with volume " + this.volume
        );
    }
}