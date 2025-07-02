package com.designpattern.mediator.EsempioGenerico;

public class Main 
{
    public static void main(String[] args) 
    {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);

        mediator.setColleagueA(a);
        mediator.setColleagueB(b);

        a.doSomething();
        b.doSomething();
    }
}