package com.company.Javarush.OOP1;

import com.company.OOP.Task10.Country;

/**
 * Created by ПК on 24.01.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }
    String getDescription(){
        return super.getDescription () + " Моя страна - " + Country.Moldova + "Я несу + " + getCountOfEggsPerMonth ()+ " яиц в месяц.";
    }
}
