package com.company.Interview;

/**
 * Created by ПК on 28.12.2016.
 */
public class Class05 {
    public static void main(String[] args) {
        StringDouble stringDouble = method1 ();
        System.out.println (stringDouble.s + stringDouble.d);
    }

    public static StringDouble method1(){
        String s = "text ";
        double b = 8;
        return new StringDouble (s, b);
}

    public static class StringDouble{
        String s;
        double d;

        public StringDouble(String s, double d) {
            this.s = s;
            this.d = d;
        }
    }
}
