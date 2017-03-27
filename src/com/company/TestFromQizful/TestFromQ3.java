package com.company.TestFromQizful;

/**
 * Created by Маша on 27.03.2017.
 */
public class TestFromQ3 {

   static class A1 {}

    interface I1 {}

    static class B1 extends A1 implements I1 {}

    public static class OverloadTest {
        static public  void foo(A1 a) { System.out.print("A"); }
        static private void foo(B1 b) { System.out.print("B"); }
        static private void foo(I1 i) { System.out.print("I"); }

        public static void main(String[] args) {
            A1 a = new B1();
            OverloadTest.foo(a);
            OverloadTest.foo((B1) a);
        }

    }

//        Object a = new Object();
//        String strA = "text";
//        String strB = "text";
//        strA += "1";
//        strB += "1";
//        System.out.println(strA != strB);
//        strA = "text1";
//        strB = "text1";
//        System.out.println(strA != strB);
//        char ch = '0';
//        while (ch <= 9)
//            System.out.print(ch++);
//        System.out.println(true ? false :true == true ? false : true);
//        byte b = 0;
//        while (++b > 0);
//        System.out.println(b);


}
