package com.designpattern.factory.EsempioGenerico;

public class ConcreteCreatorB extends Creator 
{
    @Override
    public IProduct factoryMethod() 
    {
        return new ConcreteProductB();
    }
}
