package com.company.TestFromQizful.Test;

/**
 * Created by Admin on 08.06.2017.
 */
public class Operations {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        do {
            y--;
            ++x;
        } while (x < 5);
        System.out.print(x + "," + y);


    }

    }
class Test {
    private static Boolean b1 = false;
    private static Boolean b2 = false;

    public static void main(String[] args) {
        if (b1 || !b2 || !b1 || b2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
 class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        double c = (double) (a/b);
        String str = String.format("%.6f", c);
        System.out.println(str);
    }
}
 class A {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a || b && c)
            System.out.print("Hello ");
        if (a && !b && c)
            System.out.print("World");
    }
}
