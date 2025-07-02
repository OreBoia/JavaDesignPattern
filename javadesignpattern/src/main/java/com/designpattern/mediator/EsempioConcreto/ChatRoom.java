package com.designpattern.mediator.EsempioConcreto;

import java.util.ArrayList;

public class ChatRoom implements ChatMediator
{
    private final ArrayList<Utente> utenti = new ArrayList<>();

    @Override
    public void inviaMessaggio(String messaggio, Utente mittente) 
    {
        for(Utente u : utenti)
        {
            if(u != mittente)
            {
                u.ricevi(messaggio);
            }
        }
    }

    @Override
    public void aggiungiUtente(Utente utente) 
    {
        utenti.add(utente);
    }

}
