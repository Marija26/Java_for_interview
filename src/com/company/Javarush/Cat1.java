package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 13.01.2017.
 */
/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/
public class Cat1 {
    public static String multiply(String s) { // A
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += s; // AAAAA
        }
        System.out.println ();
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for (int i = 0; i < count ; i++) {
            result +=s;
        }
        return result;
    }

    public static void main(String[] args) {

        multiply("A");
        multiply("B", 10);
    }
}










