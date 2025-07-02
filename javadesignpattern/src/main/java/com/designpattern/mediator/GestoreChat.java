package com.designpattern.mediator;

public class GestoreChat 
{
    public static void main(String[] args) 
    {
        ChatMediator chatRoom = new ChatRoom();

        Utente u1 = new UtenteChat(chatRoom, "Pinocchio");
        Utente u2 = new UtenteChat(chatRoom, "Volpe");

        chatRoom.aggiungiUtente(u1);
        chatRoom.aggiungiUtente(u2);

        u1.invia("Ciao, Volpe. Dove sono i miei soldi");
    }
}
