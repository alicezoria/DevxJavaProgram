package com.java.class15;
// Take full name from user and print initials of it
import java.util.Scanner;
public class PrintInitials {
    public static void main(String[] args) {
        String fullName = "Alisa Vladislavovna Zoria";

        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        System.out.println(firstName.charAt(0) + "."
        + middleName.charAt(0) + "."
        + lastName.charAt(0) + ".");
    }
}
