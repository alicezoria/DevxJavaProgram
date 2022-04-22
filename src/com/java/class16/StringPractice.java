package com.java.class16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Enter new string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for( int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
