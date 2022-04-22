package com.java.class08;

public class PrefixAndPostfix {
    public static void main(String[] args) {

        int i = 1;
        int j = 4;
        int k = j++ + i;

        System.out.println(i); // 1
        System.out.println(j); // 5
        System.out.println(k); // 5
    }
}
