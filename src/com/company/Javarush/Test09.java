package com.company.Javarush;

/**
 * Created by ПК on 24.10.2016.
 */
public class Test09 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5,18, 7);
        Cat cat1 = new Cat("Fedia", 5,15, 4);
        Cat cat2 = new Cat("Valka", 5,12, 9);
        System.out.println(cat.name + " " + cat.age + " " + cat.weight + " " + cat.strength);
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.weight + " " + cat1.strength);
        System.out.println(cat2.name + " " + cat2.age + " " + cat2.weight + " " + cat2.strength);

    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }

}

