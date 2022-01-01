package com.test.designPattern.ObserverPattern.case2.step1;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher {
    private List<Observer> observers = new ArrayList();
    private boolean play; //실행 여부



    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(play);
        }
    }

    public void setFlag(boolean play){
        this.play = play;
        notifyObservers();
    }

    public boolean getFlag(){
        return play;
    }
}
