package com.company.OOP.Task04;

/**
 * Created by ПК on 15.12.2016.
 */
public final class BodyPart {
    String bodyPart;

    public BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    final static BodyPart hand = new BodyPart ("Hand");
     final static BodyPart leg = new BodyPart ("Leg");
     final static BodyPart head = new BodyPart ("Head");
    final static BodyPart chest = new BodyPart ("Chest");

    @Override
    public String toString() {
        return bodyPart;
    }
}
