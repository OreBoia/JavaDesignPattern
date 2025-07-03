package com.designpattern.decorator.EsempioConcreto;

public class MilkDecorator extends BeverageDecorator
{
    public MilkDecorator(Beverage beverage) 
    {
        super(beverage);
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Latte";
    }

    public double cost()
    {
        return beverage.cost() + 0.30;
    }
}
