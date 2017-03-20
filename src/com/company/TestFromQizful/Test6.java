package com.company.TestFromQizful;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Маша on 18.03.2017.
 */
/*For s1 = "15" and s2 = "3", the output should be
multiplyTwoStrings(s1, s2) = "45";
For s1 = "13" and s2 = "13", the output should be
multiplyTwoStrings(s1, s2) = "169".*/
public class Test6 {
    public static void main(String[] args) {
        String s1 = "15";
        String s2 = "3";
        System.out.println(multiplyTwoStrings(s1, s2));
    }

    static String multiplyTwoStrings(String s1, String s2) {
        long a = Long.parseLong(s1);
        long b = Long.parseLong(s2);

        BigInteger result = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        String s = "" + result;
        return s;
    }


}
class Parent {
    public Parent(String s){
        print("created");
    }
    public static void print(String s){
        System.out.println("Parent: " + s);
    }
}

class Child extends Parent {
    public Child() {
        super("H");
    }

    public static void print(String s){
        System.out.println("Child: " + s);
    }
    public static void main(String[] args){
        Child child = new Child();
        print("created");
    }
}
//    public static void main(String[] args) {
//        String s1 = "15";
//        String s2 = "3";
//        multiplyTwoStrings(s1, s2);
//    }
//
//    static String multiplyTwoStrings(String s1, String s2) {
//        Integer a = Integer.valueOf(s1) * Integer.valueOf(s2);
//        System.out.println(a);
//        String q = Integer.toString(a);
//        return q;
//
//
//    }
//}



