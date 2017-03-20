package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 07.11.2016.
 */
/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Array10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<String> list = new ArrayList<> ();
        for (int i = 0; i <10 ; i++) {
            list.add(0, reader.readLine ());

        }
        for (int i = 0; i <list.size () ; i++) {
            System.out.println (list.get(i));

        }
    }
}
