package com.company.Lesson17;

import java.util.Date;

/**
 * Created by ПК on 10.11.2016.
 */
/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/
public class Class02 {
    public static void main(String[] args) {
        System.out.println (isDateOdd ("JANUARY 2 2000"));


    }
    public static boolean isDateOdd(String date){
        Date dateTime = new Date (date);
        if(dateTime.getDate ()% 2 == 0)
            return false;
        else
            return true;

    }
}
