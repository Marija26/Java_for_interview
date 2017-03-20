package com.company.Lesson6;

/**
 * Created by ПК on 19.09.2016.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] list = new int[10];

        String[] arr = new String[5];
        int b;
        list[5] = 567;
        list[0] = 5;

        System.out.println(list[2]);

        arr[4] = "Test";

        System.out.println(arr[2]);

        for(int i = 0; i < 10; i++){
            System.out.println(list[i]);
        }

        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }
}
