package com.company.OOP.Task06;

/**
 * Created by ПК on 05.01.2017.
 */
public class Computer {
    private KeyBoard keyBoard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer() {
        this.keyBoard = new KeyBoard ();
        this.monitor= new Monitor ();
        this.mouse = new Mouse ();


    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }


    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
