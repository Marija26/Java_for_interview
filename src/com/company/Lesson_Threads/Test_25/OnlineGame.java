package com.company.Lesson_Threads.Test_25;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 09.05.2017.
 */
public class OnlineGame extends Thread {
    volatile static List<String> steps = new ArrayList<>();
    public static volatile boolean isWinnerFound = false;

    static {
        steps.add("Начало игры");
        steps.add("Сбор ресурсов");
        steps.add("Рост экономики");
        steps.add("Убийство врагов");
    }

    Gamer gamer1 = new Gamer("Den", 2);
    Gamer gamer2 = new Gamer("Qwer", 5);
    Gamer gamer3 = new Gamer("Zak", 9);


    @Override
    public void run() {
        gamer1.start();
        gamer2.start();
        gamer3.start();
        while (!isWinnerFound) {
        }
        gamer1.interrupt();
        gamer2.interrupt();
        gamer3.interrupt();


    }
}
