package com.company.Patterns;

/**
 * Created by Маша on 23.04.2017.
 */
public class Prototype {
    public static void main(String[] args) {
        Human human = new Human("Vasia", 18);
        System.out.println(human);
       Human copy = (Human)human.copy();
        System.out.println(copy);
        HumanFactory humanFactory = new HumanFactory(copy);
       Human h1 = humanFactory.makeCopy();
        System.out.println(h1);
        humanFactory.setPrototype(new Human("Valeria", 30));
        Human h2 = humanFactory.makeCopy();
        System.out.println(h2);

    }

}

interface Copyable {
    Object copy();
}

class Human implements Copyable {
    int age;
    String name;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human[age = " + age + "; name = " + name + "]";
    }

    public Object copy() {
        Human copy = new Human(name, age);
        return copy;

    }

}

class HumanFactory {
    Human human;

    public HumanFactory(Human human) {

        setPrototype(human);
    }

    public void setPrototype(Human human) {

        this.human = human;
    }

    Human makeCopy() {

        return (Human)human.copy();
    }
}

