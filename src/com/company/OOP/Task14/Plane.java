package com.company.OOP.Task14;

/**
 * Created by Маша on 02.02.2017.
 */
public class Plane implements Flyable {



   private int pasenger;
    Plane(int pasenger){
        this.pasenger = pasenger;

    }
    @Override
    public String fly() {
        return "Plane is flying";
    }


    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }


    public int getPasenger() {
        return pasenger;
    }
}
