package com.designpattern.decorator.EsempioConcreto;

public class SambucaDecorator extends BeverageDecorator
{
    public SambucaDecorator(Beverage beverage) 
    {
        super(beverage);
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Sambuca";
    }

    public double cost()
    {
        return beverage.cost() + 0.15;
    }
}
