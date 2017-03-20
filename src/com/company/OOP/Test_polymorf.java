package com.company.OOP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Маша on 22.02.2017.
 */
public class Test_polymorf {
    public static void main(String[] args) {

    }

    public static class Animal{
        public void method(){
            System.out.println("Animal");
        }
        public void method1(){
            System.out.println("Animal");
        }
        public void method2(){
            System.out.println("Animal");
        }
    }

    public class Cat extends Animal{

        public void method() {
            System.out.println("Cat");
        }
    }
}
