package com.company.Lesson03;

/**
 * Created by ПК on 08.09.2016.
 */
public class Test08 {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Senya", 15, 17);
        Cat cat2 = new Cat ("Petya", 10, 9);
        System.out.println(cat1.fight(cat2));
    }

    public static class Cat{
        String name;
        int age;
        int strenght;

        Cat (String n, int a, int s){
            this.name = n;
            this.age = a;
            this.strenght = s;
        }

        public boolean fight(Cat anotherCat){
            if(this.strenght > anotherCat.strenght){
                return true;
            } else {return false;}
        }


    }


}
