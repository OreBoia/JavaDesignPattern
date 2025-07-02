package com.designpattern.state.EsempioConcreto.States;

import com.designpattern.state.EsempioConcreto.PlayerContext;
import com.designpattern.state.EsempioConcreto.PlayerState;


public class PlayingState implements PlayerState
{
    @Override
    public void PremiTasto(PlayerContext context) 
    {
        System.out.println("Riproduzione in Pausa");
        context.setState(new PausedState());
    }
}
