package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample {
    // Scanner Class - to get user input in program (from keyboard)
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if(num1 % 5 == 0) {
            System.out.println(num1 + " is divided by 5");
        }else{
                System.out.println(num1 + " is not divided by 5");
            }

        }
    }
