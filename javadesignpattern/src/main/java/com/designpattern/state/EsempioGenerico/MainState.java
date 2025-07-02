package com.designpattern.state.EsempioGenerico;

public class MainState 
{
    public static void main(String[] args) 
    {
        Context context = new Context();

        context.setState(new StateA());
        context.request();

        context.setState(new StateB());
        context.request();
    }
}
