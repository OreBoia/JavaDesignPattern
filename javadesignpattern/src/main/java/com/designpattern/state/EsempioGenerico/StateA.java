package com.designpattern.state.EsempioGenerico;

public class StateA implements State{

    @Override
    public void handle() 
    {
        System.out.println("StatoA: comportamento specifico");
    }

}
