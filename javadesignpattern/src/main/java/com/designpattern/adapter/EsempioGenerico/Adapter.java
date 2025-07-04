package com.designpattern.adapter.EsempioGenerico;

class Adapter implements Target 
{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) 
    {
        this.adaptee = adaptee;
    }

    public void request() 
    {
        adaptee.specificRequest();
    }
}