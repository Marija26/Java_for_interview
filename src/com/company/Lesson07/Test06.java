package com.company.Lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 22.09.2016.
 */
/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] s =new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = reader.readLine();

        }
        for (int i = 4; i >=0; i--) {
            System.out.println(s[i]);

        }
    }
}
