package com.company.Javarush.OOP3;

/**
 * Created by ПК on 26.01.2017.
 */
/*2. Дегустация вин.

1. Создать абстрактный класс Drink с реализованным методом void taste(), который выводит в консоль "Вкусно".
2. Создать класс Wine, который наследуется от Drink, с реализованным методом String getHolidayName(), который возвращает строку "День рождения".
3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом String getHolidayName(), который возвращает строку "Новый год".
4. Написать такую реализацию методов getDeliciousDrink, getWine, getBubblyWine, чтобы метод main отработал без ошибок.
5. Каждый класс и интерфейс должны быть в отдельных файлах.
6. Метод main менять нельзя!*/
public class Task01 {
    public static void main(String[] args) {
       getDeliciousDrink().taste ();
        System.out.println (getWine().getHolidayName ());
        System.out.println (getBubblyWine().getHolidayName ());

    }
    public static Drink getDeliciousDrink() {
        return new Wine ();}


    public static Wine getWine() {
        return  new Wine ();
    }
    public static Wine getBubblyWine() {
        return new BubbleWine ();
    }

}
