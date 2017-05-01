package com.company.Lesson_Threads;

/**
 * Created by Маша on 01.05.2017.
 */
/* Последовательные выполнения нитей
1. В выполняющем классе создать переменную message = "inside main "
2. В выполняющем классе создать метод sleep(), который отправляет нить в сон на 10 мс
3. Создать класс My_Thread, сделать его нитью
3.1 В классе My_Thread:
- создать переменную message = "inside My_Thread "
- реализовать мтеод run(): выводить 10 раз надпись message + i, i - число от 0 до 9.
После каждого вывода вызывать метод sleep
4. В выполняющем классе создать нить My_Thread
5. В выполняющем методе запустить нить
5.1 Выводить 10 раз надпись message + i, i - число от 0 до 9.
6. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится - продолжила метод main.
7. Пример выходных данных:
inside My_Thread 0
inside My_Thread 1
...
inside My_Thread 9
inside main 0
inside main 1
...
inside main 9
*/
public class Test_23 {
    static  My_Thread my_thread = new My_Thread();
    static String message = "inside main";
    void sleep() throws InterruptedException {
        Thread.sleep(10);
    }

    public static void main(String[] args) throws InterruptedException {
        my_thread.start();
        my_thread.join();
        for (int i = 0; i <9 ; i++) {
            System.out.println(message + i);
        }

    }

}
