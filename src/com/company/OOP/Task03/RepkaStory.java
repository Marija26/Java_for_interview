package com.company.OOP.Task03;

import java.util.List;

/**
 * Created by ПК on 12.12.2016.
 */

public class RepkaStory {
    static void tell(List<Person> list) {
        Person first;
        Person sec;
        for (int i = list.size () - 1; i > 0; i--) {

            first = list.get (i);
            sec = list.get (i - 1);

            first.pull (sec);


        }

    }


}





