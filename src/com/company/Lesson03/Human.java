package com.company.Lesson03;

/**
 * Created by ПК on 08.09.2016.
 */
public class Human {
    public static void main(String[] args){
        Humana a = new Humana("Olga", 35);
        Humana b = new Humana("Lena", 26);
        Humana c = new Humana("Julia", 32);
        System.out.println(a.name + " " + a.age);
        System.out.println(b.name + " " + b.age);
        System.out.println(c.name + " " + c.age);
    }

    public static class Humana{
        String name;
        int age;

        Humana(String n, int a){
            this.name = n;
            this.age = a;
        }


    }
}
