package com.java.class07;
// Take month name from user and print number of days

import java.util.Scanner;

public class PrintNumberOfDaysUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter a month: ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month) {
            case "January":
            case "May":
            case "may":
            case "March":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28/29");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30");
                break;

            default:
                System.out.println("Please enter a month");


        }

    }
}
