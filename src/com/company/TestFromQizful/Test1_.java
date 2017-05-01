package com.company.TestFromQizful;

/**
 * Created by Маша on 30.04.2017.
 */
public class Test1_ {

    public static void main(String[] args) {
        String a = "newspaper";
        a = a.substring(1,9);
        char b = a.charAt(1);
        a = a + b;
        System.out.println(a);

        int i = 1, j = 10;
        do
        {
            if(i++ > --j) /* Line 4 */
            {
                continue;
            }
        } while (i < 5);
        System.out.println("i = " + i + "and j = " + j); /* Line 9 */
    }

}
