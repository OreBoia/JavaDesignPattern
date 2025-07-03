package com.designpattern.strategy.EsempioConcreto;

import java.util.Arrays;
import java.util.List;

public class Main 
{
    public static void main(String[] args) {
        SortContext context = new SortContext();

        List<Integer> numbers = Arrays.asList(5,2,9,6);

        context.setStrategy(new BubbleSortStrategy());
        context.executeSort(numbers);

        context.setStrategy(new QuickSortStrategy());
        context.executeSort(numbers);
    }
}
