package com.java.class04;

public class ComparisonOperatorExample {
    public static void main(String[] args) {
        String str = "Hello";

        str = "Java";

        System.out.println(str);

        int a= 10, b = 12, c = 10, d = 8;

        System.out.println(a == b); // false (not equal)
        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a < c); // false
        System.out.println(a >= c); // true (greater or equal, equal is true)
        System.out.println(a <= b); // true
        System.out.println(a <= c); // true
        System.out.println(a != b); // true (not equal to)
        System.out.println(b <= c); // false
        System.out.println(a != c); // false (they are equal)

    }
}
