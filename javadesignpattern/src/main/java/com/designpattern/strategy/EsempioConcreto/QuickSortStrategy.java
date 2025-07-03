package com.designpattern.strategy.EsempioConcreto;

import java.util.List;

public class QuickSortStrategy implements SortStrategy
{

    @Override
    public void sort(List<Integer> list) 
    {
        System.out.println("Ordinamento con Quicksort");

        list.sort(null);

        System.out.println(list);
    }

}
