package com.java.class18;
import java.util.Scanner;
public class MergeTwoWords {

    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceae
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */

        System.out.println("Please print the first word: ");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        System.out.println("Please enter the second word: ");
        String word2 = sc.nextLine();

        String mergeString = "";
        if (word1.length() > 3 || word2.length() > 3) {
            System.out.println("Incorrect input");
        } else {
            for (int i = 0; i <word1.length(); i++)
            mergeString = mergeString + word1.charAt(i) + word2.charAt(i);
            System.out.println(mergeString);
        }
    }
}


