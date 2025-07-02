package com.designpattern.factory.EsempioGenerico;

public class ConcreteProductB implements IProduct 
{
    @Override
    public void operation() 
    {
        System.out.println("Esecuzione di ConcreteProductB.operation()");
    }
}