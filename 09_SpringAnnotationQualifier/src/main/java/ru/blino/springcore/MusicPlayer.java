package ru.blino.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

/**
 * @author Roman Blinov
 */
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") RapMusic rapMusic,
                       @Qualifier("classicalMusic") ClassicalMusic classicalMusic) {
        this.rapMusic = rapMusic;
        this.classicalMusic = classicalMusic;
    }


    public void playMusic(GenresMusic genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == GenresMusic.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(rapMusic.getSongs().get(randomNumber));
        }
    }
}