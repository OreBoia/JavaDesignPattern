package com.designpattern.decorator.EsempioGenerico;

public abstract class Decorator implements Component
{
    protected Component component;

    public Decorator(Component component)
    {
        this.component = component;
    }

    public void operation()
    {
        component.operation();
    }
}
