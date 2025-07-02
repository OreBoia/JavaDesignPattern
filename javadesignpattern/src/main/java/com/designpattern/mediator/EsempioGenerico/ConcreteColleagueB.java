package com.designpattern.mediator.EsempioGenerico;

class ConcreteColleagueB extends Colleague 
{
    public ConcreteColleagueB(Mediator mediator) 
    {
        super(mediator);
    }


    public void doSomething() 
    {
        System.out.println("ColleagueA fa qualcosa e notifica il mediatore.");
        mediator.notify(this, "A_EVENT");
    }

    public void react() 
    {
        System.out.println("ColleagueA reagisce all'evento.");
    }
}
