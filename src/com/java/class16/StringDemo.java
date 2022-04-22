package com.java.class16;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";

        // String Buffer uses the buffer mechanism to protect data from being
        // accessed and updated simultaneously, so it's thread-safe

        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.reverse();

        // String Builder does not have buffer mechanism so it's faster than StringBuffer
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}
