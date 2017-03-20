package com.company.Javarush;

/**
 * Created by ПК on 10.01.2017.
 */
/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class CycleFor4 {
    public static void main(String[] args) {


            outer:
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j > i) {
                        System.out.println();
                        continue outer;
                    }
                    System.out.print((8));
                }
            }
            System.out.println();
        }
    }















