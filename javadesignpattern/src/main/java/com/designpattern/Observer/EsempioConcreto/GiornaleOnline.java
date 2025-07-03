package com.designpattern.Observer.EsempioConcreto;

import java.util.ArrayList;
import java.util.List;

public class GiornaleOnline implements FonteNotizie
{
    private List<Notificabile> iscritti = new ArrayList<>();

    @Override
    public void aggiungiSottoscrittore(Notificabile utente) 
    {
        iscritti.add(utente);
    }

    @Override
    public void rimuoviSottoscrittore(Notificabile utente) 
    {
        iscritti.remove(utente);
    }

    @Override
    public void inviaNotifica(String notizia) 
    {
        for(Notificabile utente : iscritti)
        {
            utente.riceviNotifica(notizia);
        }
    }

}
