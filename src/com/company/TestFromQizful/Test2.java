package com.company.TestFromQizful;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Маша on 14.03.2017.
 */
/*sentence = "Man bites dog", the output should be
reverseSentence(sentence) = "dog bites Man".*/



public class Test2 {
    public static void main(String[] args) {
        String sentence = "BgwlaMUMkToumKe ANHz";
        System.out.println(reverseSentence(sentence));
    }

    static String reverseSentence(String sentence) {
        String[] array = sentence.split(" ");
        String result = "";
        for (int i = array.length - 1; i >= 0 ; i--) {
            result += array[i] + " ";
        }
        result = result.trim();
        return result;

//        String[] ms = sentence.split(" ");
//        List<String> list = Arrays.asList(ms);
//
//        Collections.sort(list, Collections.reverseOrder());
//        sentence = inSentence(list);
//        return sentence;

    }

//    static String inSentence(List list) {
//
//        StringBuilder sb = new StringBuilder();
//        for (Object o : list) {
//            sb.append(o).append(" ");
//        }
//        return sb.toString();
//
//    }
}




    /*public static void main(String[] args) {

        String s = "Man bites dog";
        String[] ms = s.split(" ");
        List<String> list = Arrays.asList(ms);
        Collections.sort(list, Collections.reverseOrder());
        String a = sort(list);
        System.out.println(a);


    }


    static String sort(List list) {

        StringBuilder sb = new StringBuilder();
        for (Object o : list) {
            sb.append(o).append(" ");

        }
        return sb.toString();

    }*/


        /*for (int i = 0; i < ms.length; i++) {

        }

        for (int i = ms.length - 1; i >= 0; i--) {

        }
        return ms;

    }*/








