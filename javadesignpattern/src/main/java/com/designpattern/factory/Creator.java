package com.designpattern.factory;

public abstract class Creator 
{
    // Factory Method: restituisce un Product
    public abstract IProduct factoryMethod();

    // Un metodo del creator che utilizza il prodotto
    public void anOperation() 
    {
        IProduct product = factoryMethod();  // creazione del prodotto
        product.operation();                // uso del prodotto
    }
}
