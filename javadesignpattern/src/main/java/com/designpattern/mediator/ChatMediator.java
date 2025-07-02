package com.designpattern.mediator;

public interface ChatMediator 
{
    void inviaMessaggio(String messaggio, Utente utente);
    void aggiungiUtente(Utente utente);
}
