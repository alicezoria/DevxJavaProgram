package com.java.class06;

import java.util.Scanner;

//Write a program when user enters any number from 0 to 6
// Print days of week
// 0 - Sunday, 1 - Monday, 2 - Tuesday......6 - Sat

public class LadderIfElseExample {

    public static void main(String[] args) {
        // Input
        System.out.println("Enter any number of month from 1 to 12: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("31");
        }else if (num == 2){
            System.out.println("29");
        }else if (num == 3){
            System.out.println("30");
        }else if (num == 4){
            System.out.println("31");
        }else if (num == 5){
            System.out.println("31");
        }else if (num == 6){
            System.out.println("30");
        }else if(num == 7) {
            System.out.println("31");
        }else if(num ==8) {
            System.out.println("31");
        }else if(num == 9) {
            System.out.println("30");
        }else if(num == 10) {
            System.out.println("31");
        }else if(num == 11) {
            System.out.println("30");
        }else{
            System.out.println("31");
        }
    }
}
