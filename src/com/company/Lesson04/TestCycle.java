package com.company.Lesson04;

/**
 * Created by ПК on 08.09.2016.
 */
public class TestCycle {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            for(int j = 0; j < 5; j++){
                System.out.println(j);
            }
        }

        System.out.println("-------------------------------------------");
        //--------------------------------------------------------------------------------------------------------------

        int i = 11;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("-------------------------------------------");
        //--------------------------------------------------------------------------------------------------------------

        int a = 11;
        do{
            System.out.println(a);
            a++;
        }while(a <= 10);

    }
}
