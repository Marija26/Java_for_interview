package com.company.Interview;

/**
 * Created by ПК on 26.12.2016.
 * n <= 0 -> 0
 * n == 1 -> 1
 * n == 2 -> 1
 *
 * n = 11 - ряд Фибоначчи
 *
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * 55
 * 89 - n = 11
 */
public class Class04_Fibonachi {
    public static void main(String[] args) {
        System.out.println (fb (5));
        print (5);

    }
    public static int fb (int s) {
        if (s == 0) return 0;
        if (s == 1) return 1;
        return fb(s - 1) + fb(s - 2);
    }



    public static void print(int x)
    {
        if (x <=0) {
            System.out.println("Boom!");
        }else
        {
            System.out.println(x);
            print(x - 1 );

        }
    }
}









