package com.company.OOP.Task04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 15.12.2016.
 */
public abstract class AbstractRobot implements Attackable, Defensable{
    private String name;
    private static int hitCount;

    public String getName() {
        return name;
    }

    public AbstractRobot(String name) {
        this.name = name;
    }

    @Override
    public BodyPart defense() {
        int a = (int) (Math.random () * 4 + 1);
        BodyPart defensed = null;

        if (a == 1) defensed= BodyPart.hand;
        else if (a == 2) defensed = BodyPart.leg;
        else if (a == 3) defensed = BodyPart.chest;
        else if (a ==4) defensed = BodyPart.head;
        return defensed;
    }

    @Override
    public BodyPart attack() {
        int a = (int) (Math.random () * 4 + 1);
        BodyPart attacked = null;

        if (a == 1) attacked = BodyPart.hand;
        else if (a == 2) attacked = BodyPart.leg;
        else if (a == 3) attacked = BodyPart.chest;
        else if (a ==4) attacked = BodyPart.head;
        return attacked;
    }
}
