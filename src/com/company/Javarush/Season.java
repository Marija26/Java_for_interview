package com.company.Javarush;

/**
 * Created by ПК on 26.12.2016.
 */
/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/
public class Season {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
    public static void checkSeason(int mount){
        if(mount > 0&& mount<= 2)
        System.out.println ("зима");
        if(mount>2 && mount<=5)
            System.out.println ("весна");
        if(mount>5&& mount<=8)
            System.out.println ("лето");
        if(mount>8&& mount<=11)
            System.out.println ("осень");
        if (mount==12)
            System.out.println ("зима");

    }
}
