package com.designpattern.decorator.EsempioGenerico;

public class ConcreteDecoratorA extends Decorator
{

    public ConcreteDecoratorA(Component component) 
    {
        super(component);
    }

    public void operation()
    {
        super.operation();
        System.out.println("Aggiunta funzionalità A");
    }
}
