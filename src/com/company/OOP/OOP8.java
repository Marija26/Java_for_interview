package com.company.OOP;

/**
 * Created by ПК on 08.12.2016.
 */
/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат –
одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class OOP8 {
    public static void main(String[] args) {
        method (new Cow());
        method (new Whale());
        method (new Dog());
        method (new UnknownAnimal());


    }
    public static void method(Object o){
        if(o instanceof Cow)
            System.out.println ("Cow");
        else if(o instanceof Whale)
            System.out.println ("Whale");
        else if(o instanceof Dog)
            System.out.println ("Dog");
        else if(o instanceof UnknownAnimal)
            System.out.println ("XAnimal");
    }

    public static class Cow{}
    public static class Whale{}
    public static class Dog{}
    public static class UnknownAnimal{}

}
