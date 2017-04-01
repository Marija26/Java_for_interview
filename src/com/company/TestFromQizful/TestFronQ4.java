package com.company.TestFromQizful;

import java.lang.reflect.Modifier;

/**
 * Created by Маша on 01.04.2017.
 */
public class TestFronQ4 {







    private void method2(MyClass param) {
        param.x = 2;
        param = new MyClass();
        param.x = 3;
    }

   static class MyClass {
        int x;
    }

    public static void main(String[] args) {
        TestFronQ4 a = new TestFronQ4();
        Class aclass = a.getClass();

        String s = aclass.getName();
        System.out.println(s);

        int mods = aclass.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
    }
}





