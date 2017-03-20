package com.company.Lesson19;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by ПК on 17.11.2016.
 */
/* Исключения
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException.
*/
public class Test01 {
    public static void main(String[] args) throws URISyntaxException, ArithmeticException {
        try {
            method1 ();
        } catch (NullPointerException e) {
            System.out.println ("Null");
        } catch (FileNotFoundException e) {
            System.out.println ("File");
        }

        System.out.println ("Ok");
    }

    public static void method1() throws FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random () * 4 + 1);
        if (i == 1) throw new NullPointerException ();
        if (i == 2) throw new ArithmeticException ();
        if (i == 3) throw new FileNotFoundException ();
        if (i == 4) throw new URISyntaxException ("", "");
    }

}
