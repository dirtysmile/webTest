package com.test.designPattern.BuilderPattern.step2;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Person {
    private String firstName;
    private String lastName;

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }
}
