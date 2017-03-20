package com.company.Lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 22.09.2016.
 */
/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[10];
        int[] f = new int[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = reader.readLine();
        }
        for (int i = 0; i < f.length; i++) {
            f[i] = s[i].length();
            System.out.println(f[i]);

        }
    }
    

}
