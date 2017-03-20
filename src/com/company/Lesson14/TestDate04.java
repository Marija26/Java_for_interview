package com.company.Lesson14;

import java.util.Date;

/**
 * Created by ПК on 31.10.2016.
 */
public class TestDate04 {
    public static void main(String[] args) {
        Date year = new Date();
        year.setMonth(0);
        year.setDate(1);
        year.setHours(0);
        year.setMinutes(0);
        year.setSeconds(0);
        Date current = new Date();
        long ms = current.getTime() - year.getTime();
        long msDay = 24*60*60*1000;

        System.out.println(ms/msDay);
    }
}
