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
        String s2 = "35";
        multiplyTwoStrings(s1, s2);
    }

       static String multiplyTwoStrings(String s1, String s2) {

            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);
            BigDecimal res = bd1.multiply(bd2);
            String result = "" + res;
            return result;

        }
}


