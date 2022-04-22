package com.java.class18;
// Write a program to check given String is Palindrome or not
import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Find Reverse of given String
        String rev = getReverse(str);

        //Compare
        if (str.equals(rev)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
    // This method will find reverse of given String

    static String getReverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
