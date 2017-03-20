package com.company.Lesson21;

/**
 * Created by ПК on 28.12.2016.
 */
public class Return2Types {
    public static void main(String[] args) {
        CharInt charInt = method2 ();
        System.out.println (charInt.a + " " + charInt.b);


    }
    public static CharInt method2(){
        char a  = '2';
        int b = 5;
        return new CharInt(a , b);


    }
    public static class CharInt{
        char a;
        int b;
        CharInt(char a, int b){
            this.a = a;
            this.b = b;
        }
    }

}
