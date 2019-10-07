package com.idi.gameofthrones.ironbankstarter;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 * @author Evgeny Borisov
 * @author Evgeny Borisov
 * @author Evgeny Borisov
 * @author Evgeny Borisov
 * @author Evgeny Borisov
 */
public class HelloWorldService {

    @Scheduled(fixedDelay = 1000)
    public void printHello() {
        System.out.println("Hello IDI");
    }
}
