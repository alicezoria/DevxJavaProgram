package com.java.homework;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if(num < 0) {
            System.out.println("Negative");
        } else{
            System.out.println("0");
        }

        }
    }
