package com.company.OOP.Task06;

/**
 * Created by ПК on 05.01.2017.
 */
/* Computer
1. Создай интерфейс CompItem.
2. Добавь в него метод String getName().
3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
5. Создай класс Computer.
6. В класс Computer добавь приватное поле типа Keyboard.
7. В класс Computer добавь приватное поле типа Mouse.
8. В класс Computer добавь приватное поле типа Monitor.
9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor).
10 Внутри конструктора инициализируйте все три поля (переменных) класса
11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter).
12. В Solution создать метод boolean isWork(CompItem item), который выводит на экран getName() части, которая приходит в параметрах.
    И возвращает true, если getName() не равен null и строка, которую возвращает getName больше 4 символов.
13. В методе main создать объект Computer и проверить наличие всех частей.
*/
public class Task06 {
    public static void main(String[] args) {
        Computer computer = new Computer ();
        if (isWork (computer.getKeyBoard ()) && isWork (computer.getMonitor ()) && isWork (computer.getMouse ()))
            System.out.println ("Computer is working");



    }
    static boolean isWork(CompItem item){
        if(item.getName () != null && item.getName ().length () > 4)
            return true;
        else
            return false;


    }
}
