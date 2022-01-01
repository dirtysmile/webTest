package com.test.test;

public class Kevin extends Human{
    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("kevin -> " + toString());
    }
}
