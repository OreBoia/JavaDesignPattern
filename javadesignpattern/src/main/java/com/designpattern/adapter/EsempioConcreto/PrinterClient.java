package com.designpattern.adapter.EsempioConcreto;

public class PrinterClient 
{
    public static void main(String[] args) 
    {
        Printer printer = new PrinterAdapter(new LegacyPrinter());
        printer.print("Documento in stampa...");
    }
}
