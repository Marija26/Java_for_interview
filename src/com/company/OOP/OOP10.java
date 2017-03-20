package com.company.OOP;

/**
 * Created by ПК on 08.12.2016.
 */
/* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/
public class OOP10 {
    public static void main(String[] args) {
        Drink cola = new Cola();
        Drink beer = new Beer();
        print (cola);
        print (beer);


    }
    public interface Drink{
        boolean isAlkoholic();

    }
    public static class Cola implements Drink{

        @Override
        public boolean isAlkoholic() {
            return false;
        }
    }
    public static class Beer implements Drink{
        @Override
        public boolean isAlkoholic() {
            return true;
        }
    }
    public static void print(Drink drink){
        if (drink.isAlkoholic () == false)
            System.out.println (drink.getClass ().getSimpleName () + " - Напиток безалкогольный");
        else System.out.println (drink.getClass ().getSimpleName () + " - Напиток алкогольный");

    }

}
