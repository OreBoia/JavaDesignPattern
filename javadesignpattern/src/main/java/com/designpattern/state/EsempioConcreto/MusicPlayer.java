package com.designpattern.state.EsempioConcreto;

public class MusicPlayer 
{
    public static void main(String[] args) 
    {
        PlayerContext player = new PlayerContext();

        player.premiTasto();
        player.premiTasto();
        player.premiTasto();
    }
}
