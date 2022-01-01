package com.test.designPattern.adapterPattern.case1;

public class BPlayerImpl implements Bplayer{
    @Override
    public void playFile(String filename) {
        System.out.println("(B) " + filename);
    }

    @Override
    public void stopFile() {

    }
}
