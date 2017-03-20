package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 27.12.2016.
 */
/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/
public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int a1 = Integer.parseInt (reader.readLine ());
        int a2 = Integer.parseInt (reader.readLine ());
        if((a+a1) > a2||a1+a2>a||a+a2> a1)
            System.out.println ("Треугольник существует.");
        else System.out.println ("Треугольник не существует.");
    }
}
