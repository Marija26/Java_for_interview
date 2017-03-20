package com.company.Lesson18;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 14.11.2016.
 */
/* Исключение при работе с коллекциями List
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
*/
public class TestException04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<> ();

        try {
            String s = list.get(18);
            System.out.println (s);

        }catch (IndexOutOfBoundsException e){
            System.out.println (e);
        }

    }
}
