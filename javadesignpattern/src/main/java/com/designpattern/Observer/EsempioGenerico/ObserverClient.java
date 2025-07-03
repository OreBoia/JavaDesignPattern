package com.designpattern.Observer.EsempioGenerico;

public class ObserverClient 
{
    public static void main(String[] args) 
    {
        Observer o1 = new ConcreteObserver("Observer1");
        Observer o2 = new ConcreteObserver("Observer2");
    
        ConcreteSubject s = new ConcreteSubject();
    
        s.registerObserver(o1);
        s.registerObserver(o2);

        // s.removeObserver(o1);

        s.setState("Stato cambiato");
    }
}
