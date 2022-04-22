package com.java.class18;

public class PrintNumbers1to50More5Divisor {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (hasMoreDivisors(i)) {
                System.out.println(i);
            }
        }
    }
        static boolean hasMoreDivisors(int num) {
            int count = 0;

            for (int a = 1; a <= num; a++) {
                if (num % a == 0){
                    count++;
                }
            }
            if (count > 5) {
                return true;
            } else {
                return false;
            }
        }
    }

