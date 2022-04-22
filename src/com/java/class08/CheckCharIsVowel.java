package com.java.class08;
// Take single character in the program & check whether it is vowel or not
// Vowels are a, e, i, o, u

public class CheckCharIsVowel {
    public static void main(String[] args) {

       char c = 'a';

       if(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u' ){
           System.out.println("It is a vowel");
       }else{
           System.out.println("It is not a vowel");
       }

    }
}
