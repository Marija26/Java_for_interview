package com.company.Lesson19;

import java.io.*;

/**
 * Created by ПК on 17.11.2016.
 */
/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
IO
File
Remote
NoSuchField
Uri
*/
public class Test03 {
    public static void main(String[] args) {
        processExceptions (new Test03 ());

    }

    public static void processExceptions(Test03 obj) {
        try {
            obj.method2 ();
            obj.method1 ();
            obj.method3 ();
        } catch (FileNotFoundException e){
            System.out.println ("File");
        } catch (IOException e){
            System.out.println ("IO");
        }catch (NoSuchFieldException e){
            System.out.println ("No");
        }
    }

    public void method1() throws IOException {
        throw new IOException ();
    }

    public void method2() throws FileNotFoundException {
        throw new FileNotFoundException ();

    }

    public void method3() throws NoSuchFieldException {
        throw new NoSuchFieldException ();

    }
}
