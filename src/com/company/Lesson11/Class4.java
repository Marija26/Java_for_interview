package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 20.10.2016.
 */
/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Class4 {
    public static void main(String[] args) throws IOException {
        List<String> ar = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            ar.add(reader.readLine());

        }

        ar = doubleValues(ar);
        for (String s : ar) {
            System.out.println(s);

        }
    }

    public static List<String> doubleValues(List<String> list) {

        List<String> arr = new ArrayList<>();
        for (String s : list) {
            arr.add(s);
            arr.add(s);

        }
        return arr;
    }
}
