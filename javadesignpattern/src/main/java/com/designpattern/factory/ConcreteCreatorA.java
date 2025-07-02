package com.designpattern.factory;

public class ConcreteCreatorA extends Creator 
{
    @Override
    public IProduct factoryMethod() 
    {
        return new ConcreteProductA();
    }
}