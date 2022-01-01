package com.test.designPattern.FacadePattern.case1;

public class ComplexProduct {
    char nameChar[] = new char[10];

    public ComplexProduct() {
    }

    public void setFirstNameCharacter(char c){
        nameChar[0] = c;
    }

    public void setSecondNameCharacter(char c){
        nameChar[1] = c;
    }
    public void setThirdNameCharacter(char c){
        nameChar[2] = c;
    }
    public void setFourthNameCharacter(char c){
        nameChar[3] = c;
    }
    public void setFifthNameCharacter(char c){
        nameChar[4] = c;
    }
    public void setSixthNameCharacter(char c){
        nameChar[5] = c;
    }

    public String getName(){
        return new String(nameChar);
    }
}
