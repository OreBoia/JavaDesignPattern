package com.designpattern.facade.EsempioConcreto;

public class HomeTheaterFacade 
{
    private Amplificatore amp;
    private Proiettore pro;
    private LettoreDVD dvd;

    public HomeTheaterFacade(Amplificatore amp, Proiettore pro, LettoreDVD dvd)
    {
        this.amp = amp;
        this.pro = pro;
        this.dvd = dvd;
    }

    public void guardaFilm()
    {
        amp.accendi();
        pro.accendi();
        dvd.play();
    }

    public void alzaVolume(Integer aumentoVolume)
    {
        amp.alzaVolume(aumentoVolume);
        System.out.println(amp.volume);
    }
}
