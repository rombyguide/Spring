package ru.blino.springcore;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("ru.blino.springcore")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
