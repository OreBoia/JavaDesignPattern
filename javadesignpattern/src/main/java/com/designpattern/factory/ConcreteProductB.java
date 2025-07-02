package com.designpattern.factory;

public class ConcreteProductB implements IProduct 
{
    @Override
    public void operation() 
    {
        System.out.println("Esecuzione di ConcreteProductB.operation()");
    }
}