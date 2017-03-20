package com.company.Lesson05;

/**
 * Created by ПК on 15.09.2016.
 */
/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
8888888888
*/
public class Test05 {
    public static void main(String[] args) {

        int n2 = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(8);
            }
            n2 ++;
            System.out.println();

        }
    }
}

