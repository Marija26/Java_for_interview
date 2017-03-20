package com.company.Lesson03;

/**
 * Created by ПК on 05.09.2016.
 */

public class ClassTest {

    public static void main(String[] args) {
       Cat cat1 = new Cat("Barsik", 3);
       Cat cat2 = new Cat("Muska", 2);
        System.out.println(cat1.name + " " + cat1.age);
        System.out.println(cat2.name + " " + cat2.age);
    }

    public static class Cat{
        String name;
        int age;

        Cat(String n, int a){
            this.name = n;
            this.age = a;
        }
    }

}
