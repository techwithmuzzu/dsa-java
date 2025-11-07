package org.dsa.tuf.easy.languagebasics;

/*
    Topic: Java Language Basics
    Sub-Topic: Strings
    Level: Easy
    Name of the question: Print the last character of the string
    Question link: https://takeuforward.org/plus/dsa/beginner-problem/language-basics/print-last-character-of-string
*/

public class PrintLastChar {
    public static char lastChar(String s){
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(lastChar("Kodekloud"));
    }
}
