package com.company.OOP.Task07;

/**
 * Created by ПК on 05.01.2017.
 */
public class MovieFactory {
    static Movie getMovie(String key){
        Movie movie = null;
       if("cartoon".equals (key)) {
           Cartoon cartoon = new Cartoon ();
           movie = cartoon;
       }
       else if( "thriller".equals (key)) {
           Thriller thriller = new Thriller ();
           movie = thriller;
       }
       else if("soapOpera".equals (key)){
           SoapOpera soapOpera = new SoapOpera ();
           movie = soapOpera;
       }
       return movie;


    }
}
