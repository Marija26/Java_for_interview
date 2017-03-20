package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 26.12.2016.
 */
/* День недели
Ввести с клавиатуры номер дня недели,
в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/
public class DayOfWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        int a= Integer.parseInt (reader.readLine ());
        if(a==1)
            System.out.println ("понедельник");
        if(a==2)
            System.out.println ("вторник");
        if(a==3)
            System.out.println ("среда");
        if(a==4)
            System.out.println ("четверг");
        if(a==5)
            System.out.println ("пятница");
        if(a==6)
            System.out.println ("суббота");
        if(a==7)
            System.out.println ("воскресенье");
        if(a>7&&a<=0)
            System.out.println ("такого дня недели не существует");
    }
}
