package com.java.homework;

public class Fullname {
    public static void main(String[] args) {
        String fullName = "leo messi";

        System.out.println("Full name is " + fullName);

        String[] words = fullName.split(" ");
        String initials = words[0].charAt(0) + "" + words[1].charAt(0);
        System.out.println("Initials are " + initials.toUpperCase());

        System.out.println("First name is " + words[0]);
        System.out.println("Last name is " + words[1]);
    }
}
