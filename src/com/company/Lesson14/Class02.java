package com.company.Lesson14;


import java.util.*;

/**
 * Created by ПК on 31.10.2016.
 */
public class Class02 {
    public static void main(String[] args) throws InterruptedException {
        Date today = new Date();
        Thread.sleep(2000);
        Date day = new Date();
        long delay = day.getTime() - today.getTime();
        System.out.println(delay);
    }
}
