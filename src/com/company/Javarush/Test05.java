package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 27.09.2016.
 */
/* Интервал
Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100
и сообщить результат на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.",
где  а - аргумент метода.
Пример для числа 112:
Число 112 не содержится в интервале.
Пример для числа 60:
Число 60 содержится в интервале.
*/
public class Test05 {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a){
        if (a >= 50 && a <= 100)
            System.out.println("Число содержится в интервале.");
        else
            System.out.println("Число не содержится в интервале.");
    }
}
