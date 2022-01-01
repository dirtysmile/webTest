package com.test.designPattern.ObserverPattern.case2.step2;

public class MyClassB implements Observer {
    Publisher observable;
    private boolean bPlay;

    public MyClassB(Publisher observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    public void myActControl(){
        if(bPlay){
            System.out.println("MyClassB : 동작을 시작합니다.");
        }else{
            System.out.println("MyClassB : 동작을 정지합니다.");
            observable.deleteObserver(this);
        }
    }
}
