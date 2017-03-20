package com.company.OOP.Task11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 23.01.2017.
 */
public class Finger extends BodyPart{
    boolean isFoot;
    Finger(String name, boolean isFoot) {
        super (name);
        this.isFoot = isFoot;
    }

    @Override
    public Object containsBones() {
        if(super.containsBones ().equals ("Yes") && !isFoot) return "Yes";
        else return "No";
    }


}
