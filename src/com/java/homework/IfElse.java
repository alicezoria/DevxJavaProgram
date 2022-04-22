package com.java.homework;

public class IfElse {
    public static void main(String[] args) {

        String text = "thetextwith1number";

        boolean textContains = text.contains("2");

        if(text.contains("2")) {
            System.out.println("Text contains 2");
        }else if (text.contains("3")){
                System.out.println("Text contains 3 ");
            }else if(text.contains ("1")) {
            System.out.println("Text contains 1");
        }else{
            System.out.println("No numbers found");

        }
    }
}
