package com.company.OOP;

/**
 * Created by ПК on 08.12.2016.
 */
/* Создать классы Cat и Dog с параметрами name и speed
Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public class OOP4 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasia", 7);
        Dog dog = new Dog("Doggy", 12);
        if(cat.isDogNear (dog)){
            System.out.println ("Winner is cat");
        } else if(dog.isCatNear (cat)){
            System.out.println ("Winner is dog");
        }
    }

    public static class Dog{
        private String name;
        private int speed;
        Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public boolean isCatNear(Cat cat){
            if(this.speed > cat.getSpeed ()) return true;
            else return false;
        }

        }


        public static class Cat {
            private String name;
            private int speed;

            Cat(String name, int speed) {
                this.name = name;
                this.speed = speed;
            }

            public String getName() {
                return name;
            }

            public int getSpeed() {
                return speed;
            }

            public boolean isDogNear(Dog dog) {
                if(this.speed > dog.getSpeed ()) return true;
                else return false;





            }
        }
}




