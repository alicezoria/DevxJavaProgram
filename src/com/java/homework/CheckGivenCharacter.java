package com.java.homework;

import java.util.Scanner;

public class CheckGivenCharacter {
    public static void main(String[] args) {

        System.out.println("Enter a character to check whether it is a vowel or not: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                 System.out.println("It is a vowel");
                 break;
            default:
                System.out.println("It is not a vowel");

        }





    }
}