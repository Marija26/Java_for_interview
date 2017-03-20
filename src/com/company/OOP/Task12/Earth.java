package com.company.OOP.Task12;

/**
 * Created by ПК on 30.01.2017.
 */
public class Earth implements Planet {
    private static Earth earth;
    private Earth(){}
    public static Earth getInstance(){
        if(earth == null){
            earth = new Earth ();
        }
        return earth;



    }

}
