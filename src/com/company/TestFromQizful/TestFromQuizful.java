package com.company.TestFromQizful;

/**
 * Created by Маша on 23.03.2017.
 */
public class TestFromQuizful {


        public static class Parent{

            public void test(){
                System.out.println("parent::test");
            }
        }

        public static class Child extends Parent{

            public void test(){
                System.out.println("child::test");
            }
        }

        public static class Tester{

            public void test(Parent obj){
                System.out.println("Testing parent...");
                obj.test();
            }

            public void test(Child obj){
                System.out.println("Testing child...");
                obj.test();
            }
        }

        public static void main(String[] args){
            Child obj = new Child();
            Tester t = new Tester();
            t.test(obj);
        }
    }

