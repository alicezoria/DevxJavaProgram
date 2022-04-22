package com.java.class16;
// Write a program to take one statement from user and find out number of words
// we have inside it

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        System.out.println("Enter any statement: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] words = str.split(" ");
            System.out.println(words.length);
        }
    }

