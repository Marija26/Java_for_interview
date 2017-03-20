package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 20.10.2016.
 */
/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:

лира
лоза
Выходные данные:
лира
лоза
лоза
*/
public class Class3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> array = new ArrayList<>();
        while(true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            array.add(s);
        }

        array = fix(array);

        for (String s : array) {
            System.out.println(s);
        }

    }

    public static List<String> fix( List<String> list ){
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.contains("р") && s.contains("л")) result.add(s);
            else if (s.contains ("р")) ;
            else if (s.contains ("л")) {
                result.add(s);
                result.add(s);
            } else {
                result.add(s);
            }
        }

        return result;
    }
}
