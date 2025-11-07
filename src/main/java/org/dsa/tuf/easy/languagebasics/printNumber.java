package org.dsa.tuf.easy.languagebasics;

import java.util.Scanner;

/*
    Topic: Java Language Basics
    Sub-Topic: Input / Output
    Level: Very Easy
    Question link: https://takeuforward.org/plus/dsa/beginner-problem/language-basics/input-output
 */

public class printNumber {
    public static void printNumberInTerminal(Scanner sc) {
        int num = sc.nextInt();
        System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printNumberInTerminal(scan);
    }
}
