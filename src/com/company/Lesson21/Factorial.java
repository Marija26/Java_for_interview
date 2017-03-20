package com.company.Lesson21;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 28.12.2016.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println (factorial(200));
    }
    static Map<Integer, BigInteger> cache = new HashMap<> ();
    public static BigInteger factorial(int n){
        if (n == 0) return BigInteger.ONE;
        BigInteger result;
        if((result = cache.get(n)) != null) return result;
        result = BigInteger.valueOf (n).multiply (factorial (n-1));
        cache.put (n, result);
        return result;
    }
}
