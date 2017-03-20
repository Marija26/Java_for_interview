package com.company.Lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ПК on 17.11.2016.
 */
/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/
public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        Date date = new Date (reader.readLine ());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("MMMM d, y EEEE");
        System.out.println (simpleDateFormat.format (date).toUpperCase ());

    }

    private static DateFormatSymbols myLocale = new DateFormatSymbols (){
        @Override
        public String[] getMonths() {
            return new String[]{"tre", "retr", "trew"};
        }

    };
}
