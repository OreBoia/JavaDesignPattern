package com.designpattern.Observer.EsempioGenerico;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject
{
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void setState(String newState)
    {
        state = newState;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) 
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) 
    {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() 
    {
        for(Observer o : observers)
        {
            o.update(state);
        }
    }

}
