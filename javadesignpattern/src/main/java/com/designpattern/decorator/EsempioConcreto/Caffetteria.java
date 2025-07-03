package com.designpattern.decorator.EsempioConcreto;

public class Caffetteria 
{
    public static void main(String[] args) 
    {
        Beverage espresso = new Espresso();
        espresso = new SambucaDecorator(espresso);
        espresso = new MilkDecorator(espresso);    

        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
    }
}
