package com.java.homework;
import java.util.Scanner;

public class ProjectPractice {
    public static void main(String[] args) {

System.out.println("Please enter a word: ");
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    if(word.length()%2==0){
        String firstHalf = word.substring(0, word.length() / 2);
        System.out.println(firstHalf + firstHalf);
    } else {
        String firstHalf = word.substring(0, word.length() / 2 + 1);
        System.out.println(firstHalf + firstHalf);
    }
    }
}
