package com.designpattern.state.EsempioConcreto.States;

import com.designpattern.state.EsempioConcreto.PlayerContext;
import com.designpattern.state.EsempioConcreto.PlayerState;

public class StoppedState implements PlayerState
{

    @Override
    public void PremiTasto(PlayerContext context) 
    {
        System.out.println("Avvia Riproduzione");
        context.setState(new PlayingState());
    }

}
