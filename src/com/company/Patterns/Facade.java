package com.company.Patterns;

/**
 * Created by Маша on 24.04.2017.
 */
public class Facade {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();

    }
}

class Computer {
    Power power = new Power();
    DVDrom dvDrom = new DVDrom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvDrom.unload();
        hdd.copyFromDVD(dvDrom);
    }
}

class Power {
    void on() {
        System.out.println("turn on");
    }

    void off() {
        System.out.println("turn off");
    }
}

class DVDrom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        System.out.println("The disc is loaded");
        data = true;
    }

    void unload() {
        System.out.println("The disc is unloaded");
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDrom dvd) {
        if (dvd.hasData()) {
            System.out.println("The disk has been copied ");
        } else {
            System.out.println("Insert the disk");
        }
    }
}

