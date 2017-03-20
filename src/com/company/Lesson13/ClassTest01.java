package com.company.Lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в убывающем порядке.
*/

public class ClassTest01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void sort(int[] arr){                     // [0]=17 [1]=23 [2]=6 [3]=28
        for (int i = 0; i < arr.length - 1; i++) {          // i = 0 i<3; || i++ i = 1 i < 3;                                 || i++ i = 2 i < 3;
            for (int j = 0; j < arr.length - 1 - i; j++) {  // j = 0 j<3; j++ j=1; j++ j=2 || j = 0 j < 2; j = 1 j < 2;       || j = 0 j < 1;
                if(arr[j] < arr[j + 1]){                    // 17 < 23 - t; 17 < 6 - f; 6 < 28 - t; || 23 < 17-f; 17 < 28-t;  || 23 < 28 - true
                    int temp = arr[j];                      // temp = 17; ---; temp = 6; ||             ---;       temp = 17; || temp = 23;
                    arr[j] =  arr[j + 1];                   // [0] = 23; ---; [2] = 28;  ||             ---;       [1] = 28;  || [0] = 28;
                    arr[j + 1] = temp;                      // [1] = 17; ---; [3] = 6;   ||             ---;       [2] = 17;  || [1] = 23;
                }
            }
        }
    }
}
// [0] = 23 [1] = 17 [2] = 6 [3] = 28
// [0] = 23 [1] = 17 [2] = 28 [3] = 6
// [0] = 23 [1] = 28 [2] = 17 [3] = 6
// [0] = 28 [1] = 23 [2] = 17 [3] = 6