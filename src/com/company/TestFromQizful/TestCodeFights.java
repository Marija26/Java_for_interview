package com.company.TestFromQizful;

import com.company.Lesson_Threads.Test_21.SleepingThread;

import java.util.ArrayList;
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
        String s = "24a0r74k";
        int k = 4;
        stringReformatting(s, k);
    }

    static void stringReformatting(String s, int k) {
        for (Object o : s.split("", s.)) {
            System.out.print(o+"-");

        }

        while(s.length() > k) {
           s= s.substring(0, k);
           s= s.substring(0, k);

        }
//        System.out.print(s + "-");



//        for (Object o : s.split(("(?<=\\G.{4})"))){
//            System.out.print(o + "-");
//        }



        }


    }







