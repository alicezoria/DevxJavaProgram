package com.java.class06;

import java.util.Scanner;

public class BloodDonationExample {

    // Nested condition / nested if else

    // write a program to print eligibility for the blood donation based

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you age");
        int age = sc.nextInt();

        System.out.println("Enter your weight");
        int weight = sc.nextInt();

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You're eligible");
            } else {
                System.out.println("You are under weight");
            }
        } else {
            if (weight >= 50) {
                System.out.println("You're too young");
            } else {
                System.out.println("You're totally not eligible");


            }
        }
    }
}