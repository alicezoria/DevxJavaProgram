package com.java.class04;

public class StringExample {
    // If we do addition with Sring it will be concatenation
    // String + String = StringString
    // String + Int = StringInt
    //
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a); // 10
        System.out.println(a + b); // 30
        System.out.println(str1 + str2); // HelloJava
        System.out.println(str1 + a); //Hello10

        System.out.println(str1 + a + b); // Hello1020 (Left to right)
        System.out.println(a + b + str1); // 30Hello (Left to right)

        System.out.println("a + b"); // a+b (as a string)
        System.out.println("a" + b); // a20 (a is String, b is variable// )
        System.out.println("a" + b + c); // a2030 (left to right)
        System.out.println(str1 + a * b); // Hello200 (priority - multiplication first)
       // System.out.println(str1 + a - b); // Error (- with String)
        System.out.println(a - b + str1); // -10Hello (Left to right)
    }
}
