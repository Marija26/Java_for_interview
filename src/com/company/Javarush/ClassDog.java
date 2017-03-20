package com.company.Javarush;

/**
 * Created by ПК on 11.01.2017.
 */
/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/
public class ClassDog {
    public static void main(String[] args) {
        Cat cat = new Cat("ghfds",5,7,3);
        Cat cat1 = new Cat("ghfds",1,2,2);
        Cat cat2 = new Cat("ghfds",1,1,1);
        System.out.println (cat.fight (cat1));
        System.out.println (cat.fight (cat2));
        System.out.println (cat1.fight (cat2));

    }

    public static class Cat {


        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {


            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {


            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
        }



