package com.designpattern.factory;

public class ConcreteProductA implements IProduct {
    @Override
    public void operation() {
        System.out.println("Esecuzione di ConcreteProductA.operation()");
    }
}