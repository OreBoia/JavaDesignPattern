package com.designpattern.Observer.EsempioGenerico;

public interface Subject 
{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
