package com.company.Lesson19;

/**
 * Created by ПК on 17.11.2016.
 */
/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/
public class Test05 {
    public static void main(String[] args) {
       try {
           divisionByZero ();
       }catch (ArithmeticException a){

       }

        System.out.println ("Ok");

    }
    public static void divisionByZero(){
        System.out.println (5/0);
    }


}
