package com.test.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ExcuteScheduleManager {

    @PostConstruct
    public void init(){
        System.out.println("ExcuteScheduleManager init");

    }
}
