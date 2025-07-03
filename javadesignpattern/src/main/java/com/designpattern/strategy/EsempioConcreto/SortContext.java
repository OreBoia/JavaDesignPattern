package com.designpattern.strategy.EsempioConcreto;

import java.util.List;

public class SortContext 
{
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void executeSort(List<Integer> list)
    {
        strategy.sort(list);
    }
}
