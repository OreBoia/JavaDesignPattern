package com.designpattern.factory.EsempioGenerico;

public class ConcreteCreatorA extends Creator 
{
    @Override
    public IProduct factoryMethod() 
    {
        return new ConcreteProductA();
    }
}