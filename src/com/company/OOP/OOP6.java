package com.company.OOP;

/**
 * Created by ПК on 08.12.2016.
 */
/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/
public class OOP6 {
    public static void main(String[] args) {


    }
    public static class Pet{
        public Pet getChild(){
            return new Pet();
        }
    }
    public static class Cat extends Pet{
        @Override
        public Cat getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        @Override
        public Dog getChild() {
            return new Dog();
        }
    }
}
