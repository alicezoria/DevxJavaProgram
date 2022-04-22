package com.java.homework;

import java.util.Scanner;

public class CheckUsernameAndPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter username & password: ");
        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "Alice", expPassword = "12345";


        if (username.equals(expUsername) && password.equals(expPassword)) {
            System.out.println("Login successful");
        } else if (username.equals(expUsername) && !password.equals(expPassword)) {
            System.out.println("Invalid password");
        } else if (!username.equals(expUsername) && password.equals(expPassword)) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Login unsuccessful");
        }
    }
}
