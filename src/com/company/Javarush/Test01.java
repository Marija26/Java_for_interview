package com.company.Javarush;

/**
 * Created by ПК on 26.09.2016.
 */
/* Меньше 5 - и
Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5 - и,
выводить строку "Число больше 5", если параметр метода больше 5 - и,
и выводить строку "Число равно 5", если параметр метода равен 5 - и.
*/
public class Test01 {
    public static void main(String[] args)
    {
        compare(3);
        compare(6);
        compare(5);




    }

    public static void compare(int a)
    {
        if (a < 5) {
            System.out.println("Число меньше 5");
        }
        if (a > 5) {

            System.out.println("Число больше 5");
        }
        if (a == 5){
        System.out.println("Число равно 5");
        }


    }
}
