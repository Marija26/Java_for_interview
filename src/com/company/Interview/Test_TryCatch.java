package com.company.Interview;

import java.io.FileInputStream;

/**
 * Created by Маша on 27.04.2017.
 */
public class Test_TryCatch {

    class A еxtends B {};
    class B еxtends C {};
    class C еxtends D {};
}

    public static void main(String[] args) {
        System.out.println(method());
    }

   static int method(){
        try {
            int a = 56 / 0;
        }catch (ArithmeticException e){
            return 5;
        }finally {
            System.out.println("a");
            int b = 56/0;
            System.out.println("b");
        }
        return 0;
    }
}
