package com.company.TestFromQizful;

/**
 * Created by Маша on 23.03.2017.
 */
/*For s = "CodefightsIsAwesome", the output should be
amendTheSentence(s) = "codefights is awesome";
For s = "Hello", the output should be
amendTheSentence(s) = "hello".*/
public class AmendTheSentence {
    public static void main(String[] args) {
        String s = "CodefightsIsAwesome";

//        s = s.toLowerCase();
       System.out.println( amendTheSentence(s));

    }
    static String amendTheSentence(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(" ");
        s =s.toLowerCase();
        return s;

    }
}
