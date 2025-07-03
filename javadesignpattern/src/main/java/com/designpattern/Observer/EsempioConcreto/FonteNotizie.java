package com.designpattern.Observer.EsempioConcreto;

public interface FonteNotizie 
{
    void aggiungiSottoscrittore(Notificabile utente);
    void rimuoviSottoscrittore(Notificabile utente);
    void inviaNotifica(String notizia);
}
