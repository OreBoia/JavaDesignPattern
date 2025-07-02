package com.designpattern.mediator.EsempioGenerico;

class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA a) {
        colleagueA = a;
    }

    public void setColleagueB(ConcreteColleagueB b) {
        colleagueB = b;
    }

    public void notify(Colleague sender, String event) {
        if (sender == colleagueA && event.equals("A_EVENT")) {
            System.out.println("Mediator reagisce all'evento di A e attiva B.");
            colleagueB.react();
        } else if (sender == colleagueB && event.equals("B_EVENT")) {
            System.out.println("Mediator reagisce all'evento di B e attiva A.");
            colleagueA.react();
        }
    }
}
