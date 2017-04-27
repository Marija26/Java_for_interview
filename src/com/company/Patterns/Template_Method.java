package com.company.Patterns;

/**
 * Created by Маша on 27.04.2017.
 */
public class Template_Method {
    public static void main(String[] args) {
        A a = new A();
        a.method();


    }
}
class A{
    void method(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
class B{
    void method(){
        System.out.println("1");
        System.out.println("4");
        System.out.println("3");
    }
}