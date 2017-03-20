package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 21.11.2016.
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
public class Class4File {
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
            String s = reader.readLine();
            if(s.isEmpty ()) break;
            list.add(s);
        }

        return list;
    }

    public static void sort(String[] array){             // Вишня 1 Боб 3 Яблоко 2 0 Арбуз ->  Арбуз 0 Яблоко 3 Вишня 2 1 Боб
        for (int i = 0; i <array.length ; i++) {                        // i = 0; i = 1; i = 2; i = 3;
            if(isNumber (array[i])){                                    // N(S)-f; N(1)-t;
                for (int j = 0; j <array.length ; j++) {                // ------; j = 0;
                    if(isNumber (array[j])){                            // ------;
                        int a = Integer.parseInt (array[i]);
                        int b = Integer.parseInt (array[j]);
                        if(a > b ){
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }else{                                                       // +;
                for (int j = 0; j < array.length; j++) {                 //  j = 1; j = 2; j = 3; j = 4;
                    if(!isNumber (array[j])){                            // N(1)-f; N(S)-t;
                        if(isGreaterThen (array[j], array[i])){          // ------; B ?= Б - t;
                            String temp = array[i];                      // temp = B;
                            array[i] = array[j];                         // [0] = Б;
                            array[j] = temp;                             // [2] = B;
                        }
                    }
                }
            }
        }
    }

    public static boolean isGreaterThen(String a, String b){
        // a больше б, то вренуть true
        // b больше a, то вренуть false
        return a.compareTo (b) > 0;
    }
    // isGreaterThen -> compareTo

    public static boolean isNumber(String s){
        try {
            int n = Integer.parseInt (s);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}

