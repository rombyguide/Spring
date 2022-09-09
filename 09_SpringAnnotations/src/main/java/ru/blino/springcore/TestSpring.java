package ru.blino.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Roman Blinov
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic1 == rockMusic2);

        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
        System.out.println(rapMusic.getSong());

        context.close();
    }
}