package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 02.11.2016.
 */
/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Array05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];
        int [] wer = new int[10];
        int[] arr = new int[10];

        for (int i = 0; i <num.length ; i++) {
            num[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i <wer.length ; i++) {
            wer[i] = num[i];

        }
        int j = 0;
        for (int i = 10; i <num.length ; i++) {
            arr[j] = num[i];
            j++;

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }


}
