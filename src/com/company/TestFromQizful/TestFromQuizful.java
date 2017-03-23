package com.company.TestFromQizful;

/**
 * Created by Маша on 23.03.2017.
 */
public class TestFromQuizful {



        private int value = 1;

        public int getValue() {
            return value;
        }

        public void changeVal(int value) {
            this.value = value;
        }

        public static void main(String args[]) {
            int a = 2;
            TestFromQuizful c = new TestFromQuizful();
            c.changeVal(a);
            System.out.print(c.getValue());
        }
    }

