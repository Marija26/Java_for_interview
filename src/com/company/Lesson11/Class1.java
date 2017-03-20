package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 20.10.2016.
 */
/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Class1 {
    public static void main(String[] args) throws IOException {
        List<String> ar = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            ar.add(reader.readLine());

        }

        int min = ar.get(0).length() ;

        for (String s : ar) {
            if (min > s.length()) min = s.length();

        }

        for (String s : ar) {
            if( s.length() == min)
                System.out.println(s);

        }

        }


    }





