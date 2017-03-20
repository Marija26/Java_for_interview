package com.company.TestFromQizful;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 16.03.2017.
 */
public class TestReverseInteger {
    public static void main(String[] args) {
        int a = -12395;
        System.out.println(reverseInteger(a));
    }

    static int reverseInteger(int x) {
        String s = "" + x;
        StringBuilder st = new StringBuilder(s).reverse();
        s = st.toString();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        if (list.get(list.size() - 1) == '-') {
            char c = list.remove(list.size() - 1);
            list.add(0, c);
        }

        s = "";
        for (Character character : list) {
            s += character;
        }

        x = Integer.parseInt(s);
        return x;
    }
}
