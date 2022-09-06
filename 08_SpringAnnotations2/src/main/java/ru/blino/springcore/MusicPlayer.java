package ru.blino.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Roman Blinov
 */
@Component
public class MusicPlayer {
//    @Autowired
//    private Music music;

    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    //    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rapMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }
}