package com.company.Lesson_Threads.Test_22;

/**
 * Created by Маша on 14.04.2017.
 */
/* Рекурсивное создание нитей
1. В выполняющем классе создать статик переменную count = 15
2. В выполняющем классе создать статик переменную int countCreatedThreads
3. Создать класс GenerateThread так, чтобы он стал нитью.
3.1. Создай конструктор GenerateThread, который должен:
3.2. Вызвать конструктор суперкласса с параметром String - номером созданной нити. Используй countCreatedThreads.
3.3. Запустить текущую нить.
3.4. Номер первой нити должен начинаться с 1.
4. Переопредели метод toString
4.1. Метод toString должен возвращать № текущей нити и слово " created". Используй getName(). Пример: [8 created]
5. Пока количество созданных нитей меньше count метод run должен:
5.1. создать новую нить типа GenerateThread.
5.2. Вывести в консоль созданную в пункте 5.1. нить.
6. В итоге должно быть выведено в консоль 15 строк.
*/
public class Test_21 {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

}



