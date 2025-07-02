package com.designpattern.factory;

public class ConcreteCreatorB extends Creator 
{
    @Override
    public IProduct factoryMethod() 
    {
        return new ConcreteProductB();
    }
}
