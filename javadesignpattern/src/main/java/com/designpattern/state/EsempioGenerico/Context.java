package com.designpattern.state.EsempioGenerico;

public class Context 
{
    private State currentState;

    public void setState(State state)
    {
        currentState = state;
    }

    public void request()
    {
        currentState.handle();
    }
}
