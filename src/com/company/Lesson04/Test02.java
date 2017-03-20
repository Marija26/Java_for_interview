package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 08.09.2016.
 */
/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine()); // 2
        int n = Integer.parseInt(reader.readLine()); // 4

        for (int i = 0; i < m; i++) { // i < 2

            for (int j = 0; j < n; j++) { // j < 4
                System.out.print("8");
            }

            System.out.println();
        }

    }
}
