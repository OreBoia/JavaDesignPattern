package com.designpattern.state.EsempioConcreto;

import com.designpattern.state.EsempioConcreto.States.StoppedState;

public class PlayerContext 
{
    private PlayerState currentState;

    public PlayerContext()
    {
        currentState = new StoppedState();
    }

    public void setState(PlayerState newState) 
    {
        currentState = newState;
    }

    public void premiTasto()
    {
        currentState.PremiTasto(this);
    }

}
