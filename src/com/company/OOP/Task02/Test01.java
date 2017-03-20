package com.company.OOP.Task02;

/**
 * Created by ПК on 12.12.2016.
 */
/* Погода
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/
public class Test01 {
    public static void main(String[] args) {
        Weather wheatherType = new Today(WheatherType.cloudy);
        Weather wheatherType1 = new Today(WheatherType.rainy);
        Weather wheatherType2 = new Today(WheatherType.hot);
        System.out.println (wheatherType);
        System.out.println (wheatherType1);
        System.out.println (wheatherType2);
        }


    public static class Today implements Weather{
       private String type;
        Today(String type){
            this.type = type;
        }

        @Override
        public String getWeatherType() {
            return type;
        }

        @Override
        public String toString() {
            return String.format ("%s for today", getWeatherType ());
        }
    }
}
