package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 22.01.2017.
 */
public class Test001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        int[] array = new int[5];
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt (reader.readLine ());

        }
        sort (array);
        for (int i : array) {
            System.out.println (i);

        }


    }
  public static void sort (int[] array){
      for (int i = array.length - 1; i > 0 ; i--) {
          for (int j = 0; j <i ; j++) {
              if (array[j] > array[j+1]) {
                  int temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;

              }

          }

      }
  }



}

