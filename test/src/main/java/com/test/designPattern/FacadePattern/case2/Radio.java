package com.test.designPattern.FacadePattern.case2;

public class Radio {
    private boolean turnOn = false;

    public void turnOn(){
        turnOn = true;
        System.out.println("Radio를 켬.");
    }

    public void turnOff(){
        turnOn = false;
        System.out.println("Radio를 끔.");
    }

    public boolean isTurnedOn(){
        return turnOn;
    }
}
