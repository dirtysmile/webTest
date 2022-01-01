package com.test.designPattern.ObserverPattern.case2.step2;


public interface Publisher {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}
