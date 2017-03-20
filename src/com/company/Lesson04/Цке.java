package com.company.Lesson04;

/**
 * Таблица умножения
 * Вывести на экран таблицу умножения 10х10 используя цикл while.
 * Числа разделить пробелом.
 * 1 2 3 4 5 6 7 8 9 10
 * 2 4 6 8 10 12 14 16 18 20
 */

public class
Цке {
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws Exception {
        int[] array = new int[20];
        for(int i = 0;i<20;i++){
            array[i]=i;
        }
        return array;
    }
    public static int max(int[] array) {
        int max=array[0];
        for(int a=0;a<20;a++){
            if (max < array[a])
                max = array[a];
        }
        return max ;
    }
}












