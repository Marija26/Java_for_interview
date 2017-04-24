package com.company.TestFromQizful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Маша on 13.04.2017.
 * HashMap
 * <p>
 * [](List) [8](List el2) [12](List el1, el4) [15](List el3) [] [] [] ...// 16
 * <p>
 * 5 2 10 11 6
 */

public final class Splitter {


    String s = new String("aa");
    public static void main(String[] args) {
       for(int i = 0; i <= 10 ; i++) {
            if (i > 6) break;

        }

       Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
        int n = 0;
        int h = 0;




        if (n == 0) {
           throw new ArithmeticException();
        } else {
            h = 5 / n;
        }

        System.out.println(h);
    }




   final int a = 20;
    String name;
    Map m = new HashMap();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Splitter splitter = (Splitter) o;

        if (a != splitter.a) return false;
        return name != null ? name.equals(splitter.name) : splitter.name == null;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
