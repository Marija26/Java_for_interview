package com.company.Lesson18;

/**
 * Created by ПК on 14.11.2016.
 */
public class TestException03 {
    public static void main(String[] args) {
        try{
            int[] array = new int[3];
            array[15] = 56;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println (e);
        }

    }
}
