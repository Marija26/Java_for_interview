package com.company.TestFromQizful.Test;

/**
 * Created by Маша on 15.04.2017.
 */
public abstract class Human {
    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println((c1 + c2 + c3));
        new RichMan().getWoman();
        new PrimitiveMan().getWoman();



    }

    public void getWoman(){
        meet();
        makeDate();
        spendDate();
        inviteHome();
        doBadthings();

    }
    protected abstract void meet();
    protected abstract void makeDate();
    protected abstract void spendDate();
    protected abstract void inviteHome();
    protected abstract void doBadthings();
}
