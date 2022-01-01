package com.test.designPattern.FacadePattern.case2;

public class TestPattern {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Radio radio = new Radio();
        Light light = new Light();

        //이전 사용 방식
        //집에서 나갈 때 동작
        computer.turnOff();
        light.turnOff();
        radio.turnOff();

        HomeFacade home = new HomeFacade(computer,light,radio);

        home.homeIn();
    }
}
