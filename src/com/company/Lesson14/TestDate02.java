package com.company.Lesson14;

import java.util.Date;

/**
 * Created by ПК on 31.10.2016.
 */
public class TestDate02 {
    public static void main(String[] args) throws InterruptedException {
        Date startTime = new Date();
        long ms = startTime.getTime() + 3000;
        Date endDate = new Date(ms);

        Thread.sleep(4000);

        Date currentDate = new Date();

        if(currentDate.after(endDate)){
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
}
