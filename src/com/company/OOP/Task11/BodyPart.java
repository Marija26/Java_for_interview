package com.company.OOP.Task11;

/**
 * Created by ПК on 23.01.2017.
 */
public class BodyPart implements Alive {
    private String name;
    BodyPart(String name){
        this.name = name;
    }



    @Override
    public Object containsBones() {
        return "Yes";

    }

    @Override
    public String toString() {
       if(containsBones ().equals ("Yes")) return name + " содержит кости";
        else return name + " не содержит кости";
    }
}
