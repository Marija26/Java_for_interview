package com.company.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 22.09.2016.
 */
public class Homework{

    public static void main(String[] args) throws IOException {
        int[] a = initializeArray();
        System.out.println(max(a));
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

        }
        return arr;
    }

    public static int max (int[] array){
        int maximum = array[0];
        for (int i = 1; i < array.length ; i++) {

            if (array[i] > maximum ){
                maximum = array[i];
            }

        }
            return maximum;
    }
}

