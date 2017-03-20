package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 16.01.2017.
 */
/* Задача по алгоритмам
        Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
        Пример ввода:
        Вишня
        1
        Боб
        3
        Яблоко
        2
        0
        Арбуз
        Пример вывода:
        Арбуз
        3
        Боб
        2
        Вишня
        1
        0
        Яблоко
        */
public class SortStringInt {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<String> list = new ArrayList<> ();
        while (true) {
            String s = reader.readLine ();
            if (s.isEmpty ()) break;
            list.add (s);
        }

        String[] strings = list.toArray (new String[list.size ()]);
        sort (strings);

        for (String string : strings) {
            System.out.println (string);
        }
    }

    private static void sort(String[] list) {
        for (int i = 0; i <list.length; i++) {
            if(isNumber (list[i])){
                for (int j = 0; j <list.length ; j++) {
                    if(isNumber (list[j])){
                        int a = Integer.parseInt (list[i]);
                        int b = Integer.parseInt (list[j]);
                        if(a > b){
                            String temp = list[i];
                            list[i] = list[j];
                            list[j] = temp;
                        }
                    }
                }
            }else{
                for (int j = 0; j <list.length ; j++) {
                    if(!isNumber (list[j])){
                        if(isGreaterThen (list[j],list[i])){
                            String temp = list[i];
                            list[i] = list[j];
                            list[j] = temp;
                        }
                    }
                }
            }
        }


    }


    private static boolean isGreaterThen(String a, String b) {
       return a.compareTo (b) >0;

    }

    private static boolean isNumber(String s) {
       try{
          Integer.parseInt (s);
           return true;
       }catch(NumberFormatException m){
           return false;
       }
    }
}

