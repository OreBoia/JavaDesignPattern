package com.designpattern.decorator.EsempioConcreto;

public abstract class BeverageDecorator implements Beverage
{
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription();
    }

    public double cost()
    {
        return beverage.cost();
    }
}
