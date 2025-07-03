package com.designpattern.strategy.EsempioGenerico;

public class Main 
{
    public static void main(String[] args) 
    {    
        Context context = new Context();
    
        context.setStrategy(new ConcreteStrategyA());
        context.performTask();

        context.setStrategy(new ConcreteStrategyB());
        context.performTask();
    }
}
