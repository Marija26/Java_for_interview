package com.company.Lesson19;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ПК on 17.11.2016.
 */

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/
public class Test04 {
    public static void main(String[] args) {
        processExceptions(new Test04 ());
    }
    public static void processExceptions(Test04 obj ){
        try{
           obj.method1();
            obj.method2();
            obj.method3();

        }catch (ArithmeticException | NullPointerException | NumberFormatException a){
            System.err.println ("Error");
        }

    }
    public void method1(){
        throw new ArithmeticException ();

    }
    public void method2(){
        throw new NullPointerException ();


    }
    public void method3(){
        throw new NumberFormatException ();

    }
}
