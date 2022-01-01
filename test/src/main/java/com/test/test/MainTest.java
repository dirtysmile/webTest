package com.test.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MainTest {
    public static void main(String[] args) {
        Member m = getMember(new Member("thkim",13));

        System.out.println(m.toString());

    }

    public static Member getMember(Member m){
        Member member = m;
        return member;
    }


}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Member{
    String name;
    int age;
}
