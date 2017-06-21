package com.company.Interview;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 18.06.2017.
 */
public class Interview_ {


    public static void main(String[] args) {
        User user = new User(1, 6);
        User user1 = new User(1, 6);
        Set<User> set = new HashSet<>();
        set.add(user);
        set.add(user1);
        System.out.println(set);

    }

    static class User {
        int b;
        int age;

        User(int b, int age) {
            this.b = b;
            this.age = age;
        }

        @Override
        public int hashCode() {
            int result = b;
            result = 31 * result + age;
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (b != user.b) return false;
            return age == user.age;
        }
    }

}

       interface Werter {
   default int meth1(){
        return 8;
    }
    static void meth2(){
        System.out.println("wer");
    }

}
