package com.company.Lesson03;

/**
 * Created by ПК on 05.09.2016.
 */
public class Test02 {
    public static void main(String[] args) {
        Dog dog1 = new Dog ("Sharik", 5, 15, 85);
        Dog dog2 = new Dog ("Bobik", 3, 18, 90);
        System.out.println("Name is " + dog1.name + " age is " + dog1.age + " weight is " + dog1.weight + " height is " + dog1.height);
        System.out.println(dog2.name + " " + dog2.age + " " + dog2.weight + " " + dog2.height);


    }

    public static class Dog{
        String name;
        int age;
        int weight;
        int height;

        public Dog (String a, int b, int c, int d){
            this.name = a;
            this.age = b;
            this.weight = c;
            this.height = d;
        }
    }

}
