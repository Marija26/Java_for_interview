package com.company.OOP.Tasko5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 05.01.2017.
 */
/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
1.1. Создать интерфейс Person, в н'м создать 4 вложенных класса:
- User, с методом live() - который выводит на экран строку типа Usually I just live.
- Looser, с методом doNothing() - который выводит на экран строку типа Usually I do nothing.
- Coder, с методом coding() - который выводит на экран строку типа Usually I create code.
- Proger, с методом enjoy() - который выводит на экран строку типа Wonderful life!.
2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.
3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/
public class UserLooserCoder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        while (true) {
            Person person = null;
            String s = reader.readLine ();
            if ("user".equals (s))  {
                Person.User user = new Person.User ();
                person = user;
            } else if ("looser".equals (s)) {
                Person.Looser looser = new Person.Looser ();
                person = looser;
            } else if ("coder".equals (s)) {
                Person.Coder coder = new Person.Coder ();
                person = coder;
            } else if ("proger".equals (s)) {
                Person.Proger proger = new Person.Proger ();
                person = proger;

            } else break;


            doWork (person);
        }



    }

    public static void doWork(Person person){

        if(person instanceof Person.User){
            Person.User.live ();}
        if(person instanceof Person.Coder){
            Person.Coder.coding ();
        }
        if(person instanceof Person.Looser){
            Person.Looser.doNothing ();
        }
        if(person instanceof Person.Proger){
            Person.Proger.enjoy ();
        }

    }
}

