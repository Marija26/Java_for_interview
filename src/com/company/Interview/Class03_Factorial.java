package com.company.Interview;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 26.12.2016.
 */
public class Class03_Factorial {
    public static void main(String[] args) {
        System.out.println (factorial (200));
    }

    static Map<Integer, BigInteger> cache = new HashMap<> ();

    private static BigInteger factorial(int n){
        if(n == 0) return BigInteger.ONE;

        BigInteger result;
        if((result = cache.get(n)) != null) return result;

        result = BigInteger.valueOf (n).multiply (factorial (n - 1));
        cache.put (n, result);
        return result;
    }
}
