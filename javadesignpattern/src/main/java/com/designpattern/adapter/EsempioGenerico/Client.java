package com.designpattern.adapter.EsempioGenerico;

class Client 
{
    public static void main(String[] args) 
    {
        Adaptee adaptee = new Adaptee();

        Target adapter = new Adapter(adaptee);
        
        adapter.request();
    }
}