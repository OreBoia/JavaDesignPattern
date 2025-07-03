package com.designpattern.strategy.EsempioConcreto;

import java.util.List;

public class BubbleSortStrategy implements SortStrategy
{

    @Override
    public void sort(List<Integer> list) 
    {
        System.out.println("Ordinamento con Bubblesort");

        list.sort(null);

        System.out.println(list);
    }

}
