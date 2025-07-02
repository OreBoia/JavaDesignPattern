package com.designpattern.state.EsempioConcreto.States;

import com.designpattern.state.EsempioConcreto.PlayerContext;
import com.designpattern.state.EsempioConcreto.PlayerState;


public class PausedState implements PlayerState{

    @Override
    public void PremiTasto(PlayerContext context) 
    {
        System.out.println("Riprendo la riproduzione");
        context.setState(new PlayingState());
    }

}
