package com.company.TestFromQizful.Test;

/**
 * Created by Admin on 08.06.2017.
 */
public class Vyborka {
    public static void main(String[] args) {
        int[]a = {0,5,8,2,7};
//        selectionSort(a);
        bubbleSort(a);
        for (int i : a) {
            System.out.println(i);

        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(arr[j] >arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }
        }
    }
}
