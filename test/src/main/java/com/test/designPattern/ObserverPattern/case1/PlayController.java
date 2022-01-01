package com.test.designPattern.ObserverPattern.case1;

import java.util.Observable;

public class PlayController extends Observable {

    private boolean bPlay; //실행 여부

    public PlayController() {
    }

    // 데이터를 전달 받아 플래그 값을 변경하고,
    // 새로운 데이터가 들어왔음을 알린다.
    public void setFlag(boolean bPlay){
        this.bPlay = bPlay;
        setChanged();
        notifyObservers();
    }


    // 실행 여부 플래그 값 반환
    public boolean getFlag(){
        return bPlay;
    }
}
