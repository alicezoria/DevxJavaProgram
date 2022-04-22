package com.java.homework;

import java.util.Scanner;

public class ProjectHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I'll calculate the sum until you enter a negative number: ");
        int num = sc.nextInt();
        int quantity = 0;
        int sum = 0;

        while (num >= 0) {
            sum = sum + num;
            System.out.println("The number is not negative. Please enter another number:");
            num = sc.nextInt();
            quantity++;
        }
                System.out.println("The number is negative. The quantity of digits entered is " + quantity + "." + "The sum of all the numbers is " + sum);
        }
    }
