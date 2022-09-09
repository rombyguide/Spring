package ru.blino.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.blino.springcore.config.SpringConfig;

/**
 * @author Roman Blinov
 */
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}