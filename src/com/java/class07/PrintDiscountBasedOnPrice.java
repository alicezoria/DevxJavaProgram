package com.java.class07;

// Take a price from user and print discount value based on price

// less than 100 then print - No Discount
// less than 500 - 5%
// less than 1000 - 10%
// more or equal 1000 - 15%

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {

        System.out.println("Enter the price: ");

        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if (price < 100) {
            System.out.println("No discount");
        } else if (price < 500) {
            System.out.println("5 %");
        } else if (price < 1000) {
            System.out.println("10 %");
        } else if (price > 1000 || price == 1000) {
            System.out.println("15 %");
        }
    }
}