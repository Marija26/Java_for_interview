package com.company.OOP;

/**
 * Created by ПК on 05.12.2016.
 */
public class OOP1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat ();
        System.out.println (cat1.method1 ());
    }

    public static class Animal {
        public String method1(){
            return "Я животное - ";
        }
    }


    public static class Cat extends Animal{
        @Override
        public String method1() {
            return super.method1 () + "кот.";
        }
    }
}
