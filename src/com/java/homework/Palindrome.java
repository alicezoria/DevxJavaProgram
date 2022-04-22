package com.java.homework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a word to check whether it is a palindrome: ");
        String word = sc.nextLine().toLowerCase();

        String inverted = "";

        for (int i = word.length()-1; i>=0; i--) {
            inverted = inverted + word.substring (i, i+1);
        }

        if (word.equals(inverted)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
