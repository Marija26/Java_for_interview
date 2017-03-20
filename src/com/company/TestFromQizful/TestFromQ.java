package com.company.TestFromQizful;

import java.io.PrintStream;

/**
 * Created by Маша on 20.03.2017.
 */
public class TestFromQ {

    static class Alpha {
        static String s = "";

        protected Alpha() {
            s += "alpha ";
        }
    }

    static class SubAlpha extends Alpha {
        private SubAlpha() {
            s += "sub ";
        }
    }

    public static class SubSubAlpha extends Alpha {
        private SubSubAlpha() {
            s += "subsub ";
        }

        public static void main(String[] args) {
            new SubSubAlpha();
            System.out.println(s);
        }
    }
}

