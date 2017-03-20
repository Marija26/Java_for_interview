package com.company.Lesson_Threads.Test_11;

import java.util.*;

/**
 * Created by Маша on 22.02.2017.
 * ... 499[] 500[] 501[] ...
 * ... 499[] - 500[] - 501[] ...
 */
public class Cat extends Thread {
    Kitten k = new Kitten("Котенок 1, мама - " + getName());
    Kitten k1 = new Kitten("Котенок 2, мама - " + getName());
    Cat(String name){
        super(name);
    }
    Map map = new HashMap();
    Iterator iterator = map.entrySet().iterator();
    void initAllKitten() throws InterruptedException {
        k.start();
        k1.start();
        k.join();
        k1.join();

    }

    @Override
    public void run() {
        System.out.println(getName() + " родила 2 котенка");

        try {
            initAllKitten();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
    }
}
