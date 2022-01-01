package com.test.test;

public class Main2 {
    public static void main(String[] args) {
        Mydata md1 = new Mydata();
        md1.xpos= 10;
        md1.ypos= 11;
        md1.name= "홍길동";

        Mydata md2 = new Mydata();
        md2 = md1;

        Mydata md3 = new Mydata();
        md3.xpos = 20;
        md3.ypos = 21;
        md3.name = "손오공";

        md2.name= "전우치";

        System.out.println("test");
    }
}

class Mydata{
    int xpos;
    int ypos;
    String name;
}
