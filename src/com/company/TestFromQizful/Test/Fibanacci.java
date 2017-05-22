package com.company.TestFromQizful.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Маша on 15.05.2017.
 */
public class Fibanacci {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(fibanacci(i));
        }

        System.out.println(factorial(10));

        System.out.println(NOD(4, 8));
        StringInteger stringInteger = method1();
        System.out.println(stringInteger.s + stringInteger.q);

    }

    public static int fibanacci(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibanacci(a - 1) + fibanacci(a - 2);
    }

    public static Map<Integer, BigInteger> cashe = new HashMap<>();

    private static BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        BigInteger result;
        if ((result = cashe.get(n)) != null) {
            System.out.println("cache");
            return result;
        }
        System.out.println("not cache");
        result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cashe.put(n, result);
        return result;
    }

    public static int NOD(int a, int b) {
        int i = 1;
        int w = 0;
        while (i <= a & i <= b) {
            if (a % i == 0 & b % i == 0) {
                w = i;
                i++;
            } else i++;
        }
        return w;

    }

    public static StringInteger method1() {
        String s = "text";
        int q = 5;
        return new StringInteger(s, q);
    }

    public static class StringInteger {
        String s;
        int q;

        public StringInteger(String s, int q) {
            this.s = s;
            this.q = q;
        }


    }
}
