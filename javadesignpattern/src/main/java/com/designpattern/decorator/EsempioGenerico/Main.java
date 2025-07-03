package com.designpattern.decorator.EsempioGenerico;

public class Main 
{
    public static void main(String[] args) 
    {
        Component base = new ConcreteComponent();
        Component decorato = new ConcreteDecoratorA(base);

        decorato.operation();
    }
}
