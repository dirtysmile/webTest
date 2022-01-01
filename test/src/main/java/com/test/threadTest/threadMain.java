package com.test.threadTest;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class threadMain {
    public static void main(String[] args) {
        CronTrigger test = new CronTrigger("0/1 * * * * ?");
        System.out.println(test);


        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.initialize();

        scheduler.schedule(()->{
            System.out.println("test");
        }, test);
    }
}
