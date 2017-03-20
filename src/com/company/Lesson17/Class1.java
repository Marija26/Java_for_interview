package com.company.Lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by ПК on 10.11.2016.
 */
/* Задача по алгоритмам
Задача: Введи с клавиатуры 10 слов и выведи их в алфавитном порядке.
d f a
a d f
*/
public class Class1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String[] list = new String[3];
        for (int i = 0; i < 3; i++) {
            list[i] = reader.readLine ();
        }
        sort (list);

        for (String s : list) {
            System.out.println (s);
        }
    }

    public static void sort(String[] array) {        //d f a -> d a f -> a d f
        for (int i = 0; i < array.length - 1; ) {    // i = 0 i < 2; i++ i = 1; i-- i = 0
            int j = i + 1;                           // j = 1; j = 2; j = 1


            if (isGreaterThen (array[i], array[j])) { // d - f; f - a; d - a
               String temp = array[j];                      // temp = a;     temp = a;
                array[j] = array[i];                  // array[2] = f; array[1] = d
                array[i] = temp;                      // array[1] = a; array[0] = a;
                if (i > 0) i--;
            } else {
                i++;
            }
        }
    }

    public static boolean isGreaterThen(String a, String b) {
        // вернёт true, если а больше б
        // вернёт false, если а меньше б
        return a.compareTo (b) > 0;
    }
}
