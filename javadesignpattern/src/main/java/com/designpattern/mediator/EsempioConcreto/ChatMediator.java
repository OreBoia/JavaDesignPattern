package com.designpattern.mediator.EsempioConcreto;

public interface ChatMediator 
{
    void inviaMessaggio(String messaggio, Utente utente);
    void aggiungiUtente(Utente utente);
}
