package com.java.class13;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str1 = "Hello";
        String str2 = sc.nextLine();
        String blueberry = new String ("berry");

        if (str1==str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
