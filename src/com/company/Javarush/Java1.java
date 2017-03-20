package com.company.Javarush;

import com.company.OOP.Task03.Person;

/**
 * Created by ПК on 20.12.2016.
 */
/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/
public class Java1 {


    public static void main(String[] args) {
        //System.out.println (factor (1));
        //System.out.println (factor (2));
        //System.out.println (factor (3));
        //System.out.println (factor (4));
        //System.out.println (factor (5));
        //System.out.println (factor (6));
        //System.out.println (factor (7));
        //System.out.println (factor (8));
        //System.out.println (factor (9));
        //System.out.println (factor (10));
        int[] m = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55};
        for (int x = 0; x < 10; x++)
        {
            //System.out.println(m[x]);//Напишите тут ваш код
        }
        int a = 0;

        for (int i=1; i<=10; i++) {
            System.out.println(a = a+i);
        }



    }


    public static int factor(int num) {
        return (num == 0) ? 1 : num*(num+1)/2 ;
    }

}











