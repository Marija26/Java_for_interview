package com.company.OOP.Tasko5;

/**
 * Created by ПК on 05.01.2017.
 */
public interface Person {


    public class User implements Person{
        public static void live(){
            System.out.println ( "Usually I just live");
        }
    }
    public class Looser implements Person{
        public static void doNothing(){
            System.out.println ( "Usually I do nothing");
        }
    }
    public class Coder implements Person{
        public static void coding(){
            System.out.println ( " Usually I create code.");
        }
    }
    public class Proger implements Person{
        public static void enjoy(){
            System.out.println ( "Wonderful life!");
        }
    }
}
