package com.company.OOP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 26.12.2016.
 */
/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
Отловить все ошибки: NumberFormatException, FileNotFoundException
*/
public class File1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String file = reader.readLine ();
        BufferedReader readerFile = new BufferedReader (new FileReader (file));
        List<Integer> link = new ArrayList<> ();

        String s;
        while ((s = readerFile.readLine ()) != null) {
            int number = Integer.parseInt (s);
            if (number % 2 == 0) {
                link.add (number);
            }
        }

        Integer[] array = new Integer[link.size ()];
        array = link.toArray (array);
        sort (array);
        for (Integer integer : array) {
            System.out.println (integer);
        }
    }

    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}


