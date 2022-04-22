package com.java.homework;

import java.util.Scanner;

public class GetMarksPrintGrades {
    public static void main(String[] args) {

        System.out.println("Please enter your average mark: ");

        Scanner sc = new Scanner(System.in);
        int averageMark = sc.nextInt();

        if (averageMark >= 90 && averageMark <= 100) {
            System.out.println("Your grade is A");
        } else if (averageMark >= 80 && averageMark <= 89) {
            System.out.println("Your grade is B");
        } else if (averageMark >= 70 && averageMark <= 79) {
            System.out.println("Your grade is C");
        } else if (averageMark >= 60 && averageMark <= 69) {
            System.out.println("Your grade is D");
        } else if (averageMark >= 50 && averageMark <= 59) {
            System.out.println("Your grade is E");
        } else {
            System.out.println("Fail");
        }
    }

}
