package com.java.homework;

import java.util.Scanner;

public class TableOfGivenNumber {
    public static void main(String[] args) {

        System.out.println("Please enter your number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;

        while(i <= 10) {
            System.out.println(num*i);
            i=i+1;
        }
    }
}
