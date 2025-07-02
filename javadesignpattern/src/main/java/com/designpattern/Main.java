package com.designpattern;

import com.designpattern.singleton.Singleton;

public class Main {
    public static void main(String[] args) 
    {
        System.out.println("Hello world!");

        Singleton.getInstance().DoSomething();
    }
}