package ru.blino.springcore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roman Blinov
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {
        musicList.forEach(music -> System.out.println(music.getSong()));
    }
}