package com.company.Javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 08.11.2016.
 */
/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/
public class Array16 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        ArrayList<String> list = new ArrayList<String> ();
        while (true) {
            String s = reader.readLine ();
            if (s.isEmpty ()) break;
            list.add (s);

        }


        list = fix (list);

        for (String s : list) {
            System.out.println (s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> ar) {
        ArrayList<String> list1 = new ArrayList<String> ();
        for (String s : ar) {
            if (s.contains ("л")) list1.add (s);

            list1.add (s);

            if (s.contains ("р")) list1.remove (s);

        }

        return list1;

    }


}


