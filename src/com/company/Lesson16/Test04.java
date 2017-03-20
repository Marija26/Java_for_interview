package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 07.11.2016.
 */
/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine ();
        char[] chars = s.toCharArray ();
        chars[0] = Character.toUpperCase (chars[0]);
        for (int i = 0; i <chars.length - 1; i++) {
            if(chars[i] == ' ')
                chars[i + 1] = Character.toUpperCase (chars[i + 1]);

        }

        System.out.println (chars);

    }
}
