package com.designpattern.mediator.EsempioConcreto;

public abstract class Utente 
{
    protected ChatMediator mediator;
    protected String nome;

    public Utente(ChatMediator mediator, String nome)
    {
        this.mediator = mediator;
        this.nome = nome;
    }

    public abstract void invia(String messaggio);
    public abstract void ricevi(String messaggio);
}
