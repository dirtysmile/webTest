package com.test.designPattern.BuilderPattern.step2;

public class PersonBuilder {
    private String firstName;
    private String lastName;

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person build(){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }
}
