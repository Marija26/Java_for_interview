package com.company.TestFromQizful;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 16.03.2017.
 */
public class TestReverseInteger {

    public static void main(String[] args) {


//        for (final int i : new int[] { 1, 2, 3 }) {
//            System.out.println(i + 1);
//        }
        int a = -12395;
        System.out.println(reverseInteger(a));
        int then = 0;
        int[][] arr = new int[2][3];
        for(int i=0; i< arr.length; i++){
            for(int j=0;j < arr[i].length; j++){
                arr[i][j]=j;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }



    }



    static int reverseInteger(int x) {
        String s = "" + x;
        StringBuilder st = new StringBuilder(s).reverse();
        s = st.toString();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        if (list.get(list.size() - 1) == '-') {
            char c = list.remove(list.size() - 1);
            list.add(0, c);
        }

        s = "";
        for (Character character : list) {
            s += character;
        }

        x = Integer.parseInt(s);
        return x;
    }

}
