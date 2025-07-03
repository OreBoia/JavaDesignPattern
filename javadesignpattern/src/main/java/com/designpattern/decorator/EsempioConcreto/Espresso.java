package com.designpattern.decorator.EsempioConcreto;

public class Espresso implements Beverage{

    @Override
    public String getDescription() 
    {
        return "Espresso";
    }

    @Override
    public double cost() 
    {
        return 1.50;
    }

}
