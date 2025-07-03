package com.designpattern.facade.EsempioConcreto;

public class Amplificatore 
{
    Integer volume = 50;

    void accendi()
    {
        System.out.println("Amplificatore Acceso");
    }
    
    void alzaVolume(Integer aumentoVolume)
    {
        volume += aumentoVolume;
    }
}
