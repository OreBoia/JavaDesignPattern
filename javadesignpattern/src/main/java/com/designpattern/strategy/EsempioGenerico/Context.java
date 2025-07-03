package com.designpattern.strategy.EsempioGenerico;

public class Context 
{
    private Strategy strategy;

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void performTask()
    {
        strategy.execute();
    }
}
