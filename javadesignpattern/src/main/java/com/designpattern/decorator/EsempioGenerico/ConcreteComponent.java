package com.designpattern.decorator.EsempioGenerico;

public class ConcreteComponent  implements Component
{
    @Override
    public void operation() 
    {
        System.out.println("Operazione Base");
    }
}
