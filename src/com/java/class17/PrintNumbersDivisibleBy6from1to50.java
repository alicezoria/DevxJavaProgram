package com.java.class17;

public class PrintNumbersDivisibleBy6from1to50 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (isEvenDivisible(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isEvenDivisible(int num) {

        if (num % 6 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
