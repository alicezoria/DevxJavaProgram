package com.java.homework;

import java.util.Scanner;

public class TakeNumberFromUser {
    public static void main(String[] args) {

        System.out.println("Please enter divisible number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println("Number is divisible by 5 or 3");
        } else {
            System.out.println("Number is not divisible by 5 or 3");
        }
        }
    }
