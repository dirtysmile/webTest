package com.test.designPattern.adapterPattern.case2;

import com.test.designPattern.adapterPattern.case1.Aplayer;

public class BToAAdapter extends BPlayerImpl implements Aplayer{
    @Override
    public void play(String filename) {
        System.out.println("Using Adapter : ");
        playFile("filename");
    }

    @Override
    public void stop() {

    }

    //기존 코드에서 수정해야 할 노력과 분량을 어댑터 클래스 생성에 사용
    //기존에 잘 사용하던 클래스이므로
    //버그가 발생하면 어댑터 클래스만 집중적으로 살펴보면 된다.
}
