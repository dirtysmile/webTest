package com.test.designPattern.adapterPattern.case2;

public class BPlayerImpl extends Bplayer {
    @Override
    public void playFile(String filename) {
        System.out.println("(B) " + filename);
    }

    @Override
    public void stopFile() {

    }
}
