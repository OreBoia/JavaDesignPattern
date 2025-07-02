package com.designpattern.factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.anOperation();  // Usa ConcreteProductA

        Creator creatorB = new ConcreteCreatorB();
        creatorB.anOperation();  // Usa ConcreteProductB
    }
}
