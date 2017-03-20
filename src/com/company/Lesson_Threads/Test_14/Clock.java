package com.company.Lesson_Threads.Test_14;


import java.io.IOException;
import java.util.Date;

/**
 * Created by Маша on 27.02.2017.
 */
public class Clock extends Thread {
    String cityName;
    int hours;
    int minutes;
    int seconds;


    Clock(int hours, int minutes, int seconds) {
        this.cityName = "Лондон";
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.start();

    }


    void printTime() throws InterruptedException {
        java.lang.Thread.sleep(1000);
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            minutes++;
        }
        if (minutes >59) {
            minutes = 0;
            hours++;
        }
        if (hours > 23) {
            hours = 0;


        }
        if(hours == 0 && minutes == 0 && seconds == 0){
            System.out.println("В г. Лондон сейчас полночь!");
        } else {
            System.out.println("В г. " + cityName + " сейчас " + hours + " : " + minutes + " : " + seconds);
        }

    }


    @Override
    public void run() {
        MyThread m = new MyThread();
        while (!m.isStopped()) {
            try {
                printTime();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



