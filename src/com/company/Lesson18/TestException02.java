package com.company.Lesson18;

/**
 * Created by ПК on 14.11.2016.
 */
public class TestException02 {
    public static void main(String[] args) {
        try{
            String s = null;
            s.toUpperCase ();
        } catch (NullPointerException e){
            System.out.println (e.getMessage ());
        }

    }
}
