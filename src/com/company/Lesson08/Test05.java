package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 26.09.2016.
 */
/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ar.add (0, reader.readLine());
        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));

        }
    }
}

