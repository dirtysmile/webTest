package com.test.designPattern.FacadePattern.case2;

public class Computer {
    private boolean turnOn = false;

    public void turnOn(){
        turnOn = true;
        System.out.println("Computer를 켬.");
    }

    public void turnOff(){
        turnOn = false;
        System.out.println("Computer를 끔.");
    }

    public boolean isTurnedOn(){
        return turnOn;
    }
}
