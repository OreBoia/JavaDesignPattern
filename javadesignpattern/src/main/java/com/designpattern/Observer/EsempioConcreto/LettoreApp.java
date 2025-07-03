package com.designpattern.Observer.EsempioConcreto;

public class LettoreApp implements Notificabile
{
    private String nome;

    public LettoreApp(String nome)
    {
        this.nome = nome;
    }

    @Override
    public void riceviNotifica(String notizia) 
    {
        System.out.println(nome + " ha ricevuto la notizia corrente: " + notizia);
    }

}
