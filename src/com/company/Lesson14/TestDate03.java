package com.company.Lesson14;

import java.util.Date;

/**
 * Created by ПК on 31.10.2016.
 */
public class TestDate03 {
    public static void main(String[] args) {
        Date day = new Date();
        System.out.println(day.getHours() + ":" + day.getMinutes() + ":" + day.getSeconds());
    }
}
