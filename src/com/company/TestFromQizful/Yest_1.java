package com.company.TestFromQizful;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Маша on 09.03.2017.
 */
class Y {
    static class A {
        public void m(int k) {
            System.out.println("class A, method m : " + ++k);
        }
    }

    static class B extends A {
        public int m(byte k) {
            System.out.println("class B, method m : " + k++);
            return k;
        }
    }

    public static class MainClass {
        public static void main(String args[]) {
            A a = new B();
            a.m(34);
        }
    }


}












