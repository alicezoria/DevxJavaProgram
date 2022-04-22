package com.java.homework;

import java.util.Scanner;

public class FindCompanyName {
    public static void main(String[] args) {
        System.out.println("Enter the name of a product from the given list: ");

        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();

        switch (product){
            case "Gmail":
            case "Youtube":
            case "Hangouts":
                System.out.println("Google");
                break;
            case "Skype":
            case "Outlook":
                System.out.println("Microsoft");
                break;
            case "Whatsapp":
                System.out.println("Meta");
                break;
            default:
                System.out.println("Please enter a valid name of the product");
        }

    }
}
