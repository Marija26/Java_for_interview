package com.company.OOP.Task12;

/**
 * Created by ПК on 30.01.2017.
 */
public class Moon implements Planet {
    private static Moon moon;
    private Moon(){}
    public static Moon getInstatnce(){
        if(moon == null) {
            moon = new Moon ();
        }
        return moon;

    }
}
