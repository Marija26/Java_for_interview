package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 26.09.2016.
 */
/* /* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

public class Test02 {


            public static void main(String[] args) throws Exception
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                if (a < 0 && a%2 == 0 )
                    System.out.println("отрицательное четное число");


                if (a <0 && a%2 == 1 )
                    System.out.println("отрицательное нечетное число");

                if (a == 0 )
                    System.out.println("нулевое число");

                if (a > 0 && a%2 == 0 )
                    System.out.println("положительное четное число");

                if (a > 0 && a%2 == 1 )
                    System.out.println("положительное нечетное число");



        }
    }

