package com.java.class17;

// Print all prime numbers from 1 to 50

public class PrintPrimeNumberFrom1To15 {

    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        for (int a = 1; a <= 50; a++) {
            if(isPrime(a)){
                System.out.println(a);
            }
        }
    }
}
