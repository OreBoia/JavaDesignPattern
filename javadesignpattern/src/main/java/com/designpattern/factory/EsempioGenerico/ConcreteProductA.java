package com.designpattern.factory.EsempioGenerico;

public class ConcreteProductA implements IProduct {
    @Override
    public void operation() {
        System.out.println("Esecuzione di ConcreteProductA.operation()");
    }
}