package com.company.Interview;

/**
 * Created by Маша on 15.05.2017.
 */
public class BinerResearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 78, 400, 500, 567, 890, 1000, 1234};
        System.out.println(binarySearch(7, arr));
    }

    public static int binarySearch(int value, int[] arr){
        return binarySearch(value, arr, 0, arr.length-1);
    }

    public static int binarySearch(int value, int[] arr, int lo, int hi){
        if(lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if(value < arr[mid]){
            return binarySearch(value, arr, lo, mid - 1);
        } else if(value > arr[mid]){
            return binarySearch(value, arr, mid + 1, hi);
        } else return mid;
    }

}
