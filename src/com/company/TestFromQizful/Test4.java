package com.company.TestFromQizful;




//Created by Маша on 15.03.2017.


//For s = "hello, world", the output should be
//reverseVowelsOfString(s) = "hollo, werld";
//For s = "codefights", the output should be
//reverseVowelsOfString(s) = "cidefoghts";
//For s = "eIaOyU", the output should be
//reverseVowelsOfString(s) = "UOaIye".

import java.util.ArrayList;
import java.util.List;

public class Test4 {


    public static void main(String[] args) {

        String s = "Hello, world";
        String vowels = "aeiouAEIOU";
        System.out.println(reverseVowels(s));


    }


    public static String reverseVowels(String string) {
        String vowels = "aeiouAEIOU";

        int lo = 0;
        int hi = string.length() - 1;
        char[] ch = string.toCharArray();

        while (lo < hi) {
            if (!vowels.contains(String.valueOf(string.charAt(lo)))) {
                lo++;
                continue;
            }

            if (!vowels.contains(String.valueOf(string.charAt(hi)))) {
                hi--;
                continue;

            }

            // swap
            swap(ch, lo, hi);
            lo++;
            hi--;
        }
        return String.valueOf(ch);
    }

    private static void swap(char[] ch, int lo, int hi) {
        char tmp = ch[lo];
        ch[lo] = ch[hi];
        ch[hi] = tmp;
    }
            }









