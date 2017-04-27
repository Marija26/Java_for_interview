package com.company.Patterns;

/**
 * Created by Маша on 27.04.2017.
 */
public class Decorator {
    public static void main(String[] args) {
PrinterInterface printerInterface = new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hello")));
    }
}

interface PrinterInterface {
    void print();


}

class Printer implements PrinterInterface {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);

    }
}

class QuotesDecorator implements PrinterInterface {
    PrinterInterface component;

    public QuotesDecorator(PrinterInterface component) {
        this.component = component;

    }

    @Override
    public void print() {
        System.out.println("\"");
        component.print();
        System.out.println("\"");

    }
}
class LeftBracketDecorator implements PrinterInterface{
    PrinterInterface component;

    public LeftBracketDecorator (PrinterInterface component) {
        this.component = component;

    }

    @Override
    public void print() {
        System.out.println("[");
        component.print();

    }

}
class RightBracketDecorator implements PrinterInterface {
    PrinterInterface component;

    public RightBracketDecorator(PrinterInterface component) {
        this.component = component;

    }

    @Override
    public void print() {
        System.out.println("]");
        component.print();

    }
}
