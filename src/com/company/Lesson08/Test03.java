package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 26.09.2016.
 */
/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            a.add(s);
        }

        System.out.println(a.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(a.get(i));

        }

    }
}
