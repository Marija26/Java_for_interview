package com.company.OOP.Task12;

/**
 * Created by ПК on 30.01.2017.
 */
public class Sun implements Planet{
    private static Sun sun;
    private Sun(){}
    public static Sun getInstatnce(){
        if(sun == null) {
            sun = new Sun ();
        }
        return sun;

    }
}
