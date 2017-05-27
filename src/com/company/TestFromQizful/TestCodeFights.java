package com.company.TestFromQizful;

import com.company.Lesson_Threads.Test_21.SleepingThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Маша on 10.04.2017.
 */
/*For s = "2-4a0r7-4k" and k = 4, the output should be
stringReformatting(s, k) = "24a0-r74k";

The input string "2-4a0r7-4k" is split into three groups with lengths of 1, 5 and 2.
Since k = 4, you need to split the string into two groups of 4 characters each, making the output string "24A0-R74k".

For s = "2-4a0r7-4k" and k = 3, the output should be
stringReformatting(s, k) = "24-a0r-74k".

Given the same input string and k = 3, split the string into groups of 2, 3,
and 3 characters to get the output string of "24-a0r-74k".*/
public class TestCodeFights {
    public static void main(String[] args) {
        String s = "2-4a0r7-4k";
       s =s.replace("-", "");
        int k = 3;


//        for (String s2 : s.split(String.valueOf(k), k)) {
//            System.out.println(s2);


        System.out.println(format(s, k));
    }


    public static String formatString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                counter++;
            }
            if (counter == k) {
                counter = 0;
                sb.append("-");
            }
        }
        return sb.toString();

    }

    public static String format(String str, int k) {
        int size = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
            if ((i + 1) % k == 0)
                sb.append("-");
        }

        return sb.reverse().toString();
    }
}


//
//        String r = s.replace("-", "");
//        return (r.substring(0, r.length() % k) + r.substring(r.length() % k).replaceAll(String.format("(.{%d})", k), "-$1")).replaceAll("^-", "");
















