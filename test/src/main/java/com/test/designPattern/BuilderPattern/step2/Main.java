package com.test.designPattern.BuilderPattern.step2;

public class Main {
    public static void main(String[] args) {
        Person p1 = Person.builder()
                .firstName("firstname")
                .lastName("lastname")
                .build();


    }
}
