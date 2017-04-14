package com.company;

/**
 * Created by Маша on 14.04.2017. O(log n) 45 12      67 23     45 65
 * [8](List -> el3) [12](List -> el1.equals(el4)) [16](List -> el2) /// 16 O(1) O(n)
 */
public class Test_Cat {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test_Cat test_cat = (Test_Cat) o;

        if (age != test_cat.age) return false;
        return name != null ? name.equals(test_cat.name) : test_cat.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
