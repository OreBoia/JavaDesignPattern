package com.designpattern.Observer.EsempioConcreto;

public class Main 
{
    public static void main(String[] args) 
    {
        GiornaleOnline giornaleOnline = new GiornaleOnline();

        Notificabile iscritto1 = new LettoreApp("Mario");
        Notificabile iscritto2 = new LettoreApp("Giulia");

        giornaleOnline.aggiungiSottoscrittore(iscritto2);
        giornaleOnline.aggiungiSottoscrittore(iscritto1);

        giornaleOnline.rimuoviSottoscrittore(iscritto2);

        giornaleOnline.inviaNotifica("Ultim'ora: Nevicata improvvisa a Luglio");
    }
}
