package com.designpattern.state.EsempioGenerico;

public class StateB implements State
{
    @Override
    public void handle() 
    {
        System.out.println("StatoB: comportamento specifico");
    }
}
