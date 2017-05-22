package com.company.Interview;

/**
 * Created by Маша on 15.05.2017.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2, 6, 8, 10, 15, 67, 90};
        System.out.println(binarySearch(10, a));
    }
    public static int binarySearch(int value, int[]a){
        return binarySearch(value, a, 0, a.length-1);}


    public static int binarySearch(int value, int[]a, int lo, int hi){
        if(lo>hi) return 0;
        int mid = lo + (hi - lo)/2;
        if(value> a[mid])return binarySearch(value, a, mid+1, a.length-1 );
        if(value < a[mid])return  binarySearch(value, a, 0, mid-1 );
        return mid;
    }
}
