package com.company.OOP;

/**
 * Created by ПК on 08.12.2016.
 */
/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали,
и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/
public class OOP7 {
    public static void main(String[] args) {
        method1 (new Cat());
        method1 (new Dog());
        method1 (new Bird());
        method1 (new Lamp());
    }

    public static void method1(Object o){
        if(o instanceof Cat){
            System.out.println ("Cat");
        } else if(o instanceof Dog){
            System.out.println ("Dog");
        } else if(o instanceof Bird){
            System.out.println ("Bird");
        } else if(o instanceof Lamp){
            System.out.println ("Lamp");
        }
    }

    public static class Cat{}
    public static class Dog{}
    public static class Bird{}
    public static class Lamp{}
}
