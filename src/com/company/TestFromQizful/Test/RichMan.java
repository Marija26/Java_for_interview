package com.company.TestFromQizful.Test;

/**
 * Created by Маша on 15.04.2017.
 */
public class RichMan extends Human {
    public static void main(String[] args) {
      new RichMan().print(null);
    }
    public  void рrіnt( String str ) {
        System.out.println(( "Strіng" ));
    }
    public  void print( Object о ) {
        System.out.println(( "Оbject" ));
    }
    public void print( Integer i ) {
        System.out.println( "Integer" );
    }

    @Override
    protected void meet() {

    }

    @Override
    protected void makeDate() {
        System.out.println("Hello");

    }

    @Override
    protected void spendDate() {
        System.out.println("Good day");

    }

    @Override
    protected void inviteHome() {
        System.out.println("Take some tee");

    }

    @Override
    protected void doBadthings() {
        System.out.println("You are so hot");

    }
}
