package com.designpattern.mediator.EsempioConcreto;

public class UtenteChat extends Utente
{
    public UtenteChat(ChatMediator mediator, String nome)
    {
        super(mediator, nome);
    }

    @Override
    public void invia(String messaggio) 
    {
        System.out.println(nome + " invia: " + messaggio);
        mediator.inviaMessaggio(messaggio, this);
    }

    @Override
    public void ricevi(String messaggio)
    {
        System.out.println(nome + " riceve: " + messaggio);
    }

}
