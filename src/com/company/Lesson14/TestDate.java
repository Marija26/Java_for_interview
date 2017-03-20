package com.company.Lesson14;

import java.util.Date;

/**
 * Created by ПК on 31.10.2016.
 */
public class TestDate {
    public static void main(String[] args) throws InterruptedException {
        Date today = new Date();
        System.out.println(today.getTime());
        System.out.println(today);
        System.out.println(today.getMonth());

        Thread.sleep(3000);
        Date currentDate = new Date();
        System.out.println(currentDate);

        long msDelay = currentDate.getTime() - today.getTime();
        System.out.println(msDelay);

        Date today1 = new Date();
        today1.setYear(100);
        today1.setMonth(0);
        System.out.println(today1);


    }
}

