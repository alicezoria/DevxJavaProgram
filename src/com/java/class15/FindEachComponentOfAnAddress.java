package com.java.class15;

// Write a program to print each component of String into separate line

public class FindEachComponentOfAnAddress {
    public static void main(String[] args) {
        String address = "1619, Lincoln Park, Chicago, Illinois, 60654";
        String[] parts = address.split(", ");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}
