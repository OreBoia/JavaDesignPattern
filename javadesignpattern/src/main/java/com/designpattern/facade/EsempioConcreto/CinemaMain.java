package com.designpattern.facade.EsempioConcreto;

public class CinemaMain 
{
    public static void main(String[] args) 
    {
        Amplificatore amp = new Amplificatore();
        Proiettore pro = new Proiettore();
        LettoreDVD dvd = new LettoreDVD();
        
        HomeTheaterFacade homeCinema = new HomeTheaterFacade(amp, pro, dvd);

        homeCinema.guardaFilm();
        homeCinema.alzaVolume(10);
    }
}
