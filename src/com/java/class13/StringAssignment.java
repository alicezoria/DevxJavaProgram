package com.java.class13;
// Create three String variables
// Initialize 2 variables with constant values
// Take third variable from user using Scanner class
// compare 1st and 2nd using == operator
// compare 2nd and 3rd using ==
// compare 1st and 3rd using .equals() method

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Rose";
        String str2 = "Lilac";

        System.out.println("Please enter the 3rd value: ");
        String str3 = sc.nextLine();

        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (str1 == str3) {
            System.out.println("True");
        } else {
            System.out.println("False");
            }

        if (str1.equals(str3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
            }
        }
    }
