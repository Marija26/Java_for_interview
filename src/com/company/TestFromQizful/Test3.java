package com.company.TestFromQizful;

import java.math.BigInteger;

/**
 * Created by Маша on 14.03.2017.
 */
/*For x = 12345, the output should be reverseInteger(x) = 54321;
   For x = -4243, the output should be reverseInteger(x) = -3424.*/
public class Test3 {
    public static void main(String[] args) {
        int a = 12395;
        int b = -4243;
        sort(a);

    }

    static void sort(int a) {
        String string = Integer.toString(a);
        System.out.println(string);
        String strArr[] = string.split("");
        int numArr[] = new int[strArr.length];
        for (int q = 0; q < strArr.length; q++) {
            numArr[q] = Integer.parseInt(strArr[q]);
            System.out.println(numArr[q]);
        }
        sort1(numArr);

    }

    static void sort1(int[] inter) {
        for (int i = 0; i < inter.length - 1; i++) { // 9 2 5 -> 2 9 5 -> 2 5 9
            for (int j = 0; j < inter.length - 1; j++) {
                if (inter[j] < inter[j + 1]) {
                    int temp = inter[j];
                    inter[j] = inter[j + 1];
                    inter[j + 1] = temp;


                }
            }

        }
        inInt(inter);


    }

    static void inInt(int[] inter1) {

        String str = "";
        BigInteger _a = null;

        for (int i = 0; i < inter1.length; i++) {
            str += inter1[i];
        }
        _a = new BigInteger(str);
        System.out.println(_a);

    }

}
//String string = Integer.toString(a);
//System.out.println(new StringBuilder(string).reverse().toString());

/* int a = -4243;
        String string = Integer.toString(a);
        System.out.println(string);


        char chars[] = string.toCharArray();

// считаем номер последнего элемента
        int len = chars.length - 1;

// меняеем местами символы, используя переменную tmp
        char tmp = chars[0];
        chars[0] = chars[len];
        chars[len] = tmp;
        tmp = chars[1];
        chars[1] = chars[len - 1];
        chars[len - 1] = tmp;

        string = new String(chars);
        System.out.println(string);
    }*/
/*  int x = -4243;
        System.out.println(reverse(x));
    }
        public static int reverse(int x) {
            int rev = 0;
            while(x != 0){
                rev = rev*10 + x%10;
                x = x/10;
            }

            return rev;
        }
*/



