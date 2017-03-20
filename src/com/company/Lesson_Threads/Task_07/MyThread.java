package com.company.Lesson_Threads.Task_07;

import java.util.List;

/**
 * Created by Маша on 12.02.2017.
 */
/* Stopwatch (Секундомер)
1. Разберись, что делает программа.
2. Реализуй логику метода doSeveralSteps так, чтобы учитывалась скорость бегуна.
2.1. Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
2.2. Метод sleep в классе Thread принимает параметр типа long.
*/

public class MyThread {

    public static boolean isClockRun = true;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        isClockRun = false;
    }


    static class Clock implements Runnable {
        public void run() {
            while (isClockRun) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");


            }
        }
    }
}
