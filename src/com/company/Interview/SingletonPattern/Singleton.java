package com.company.Interview.SingletonPattern;

/**
 * Created by ПК on 28.12.2016.
 */

public class Singleton {
    private static Singleton singleton = null;
   
    private Singleton() {
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton ();
        }
        return singleton;
    }
}
