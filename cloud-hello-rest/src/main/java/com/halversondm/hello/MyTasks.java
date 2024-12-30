package com.halversondm.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyTasks {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyTasks.class);

    @Scheduled(fixedDelay = 10000)
    public void printTime() {
        Date date = new Date();
        LOGGER.info("The current time is {}", date);
    }

    @Scheduled(fixedRate = 15000)
    public void printHello() {
        LOGGER.info("Hello!");
    }

}
