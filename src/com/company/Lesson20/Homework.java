package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 24.11.2016.
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
public class Homework {
    public static void main(String[] args) throws IOException {
        List<String> list = createList();
        String[] array = list.toArray (new String[list.size ()]);
        sort (array);
        for (String s : array) {
            System.out.println (s);

        }

    }
    public static List<String> createList() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        List<String> list = new ArrayList<> ();
        while(true){
            String s = reader.readLine ();
            if (s.isEmpty ()) break;
            list.add(s);

        }
        return list;


    }
    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumber (array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber (array[j])) {
                        int a = Integer.parseInt (array[i]);
                        int b = Integer.parseInt (array[j]);
                        if (a < b) {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }

                    }
                }

            }else {
                for (int j = 0; j <array.length ; j++) {
                   if(isNumber (array[j])){
                       if(isGreaterThen (array[j], array[i])){
                           String temp = array[i];
                           array[i] = array[j];
                           array[j] = temp;
                       }

                    }

                }
            }

        }
    }

    public static boolean isGreaterThen(String a, String b){
        return a.compareTo (b) > 0;

    }

    public static boolean isNumber(String s){
        try{
            int n = Integer.parseInt (s);

        }catch(NumberFormatException e){
            return false;

        }
        return true;

    }
}
