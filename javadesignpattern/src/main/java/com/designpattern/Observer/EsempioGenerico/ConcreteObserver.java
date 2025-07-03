package com.designpattern.Observer.EsempioGenerico;

public class ConcreteObserver implements Observer 
{
    private String name;

    public ConcreteObserver(String name)
    {
        this.name = name;
    }

    @Override
    public void update(String messagge) 
    {
        System.out.println(name + " ha ricevuto un aggiornamento: " + messagge);
    }
}
