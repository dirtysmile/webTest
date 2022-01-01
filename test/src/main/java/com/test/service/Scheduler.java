package com.test.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {
    @Scheduled(cron = "0 * 9 * * ?")
    public void cronJobSch(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.SSS");
        Date now = new Date();
        String stringDate = sdf.format(now);
        System.out.println("Java cron job expression:: " + stringDate);

    }

    @Scheduled(fixedDelay = 1000)
    public void schedulefixeddelayTask(){
        System.out.println("fixed delay task - " + System.currentTimeMillis() /1000);
        try{
            Thread.sleep(20000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    @Scheduled(fixedRate= 1000)
    public void scheduleFixedRateTask(){
        System.out.println("fixed rate task - " + System.currentTimeMillis() /1000);
        System.out.println("Current Thread : " + Thread.currentThread().getName());
    }


}
