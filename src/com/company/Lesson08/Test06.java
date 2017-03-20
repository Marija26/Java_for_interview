package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 26.09.2016.
 */
/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            ar.add(reader.readLine());
        }

        for (int i = 0; i < 15 ; i++) {
           String s = ar.remove(ar.size() - 1);
            ar.add(0, s);
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));

        }
    }



}
