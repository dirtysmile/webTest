package com.test.test;

public class Database {
    private static Database singleton;
    private String name;

    public Database(String name) {
        this.name = name;
    }

    public static Database getInstance(String name){
        if(singleton == null){
            singleton = new Database(name);
        }
        return singleton;
    }

    public String getName() {
        return name;
    }
}
