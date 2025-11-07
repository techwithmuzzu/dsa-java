package org.dsa.tuf.easy;

/*
    Topic: Java Language Basics
    Sub-Topic: Loops
    Level: Easy
    Name of the question: Print X, N Number of Times
    Question link: https://takeuforward.org/plus/dsa/beginner-problem/language-basics/print-x-n-numbers-of-times
*/

public class PrintXTimesOfN {
    public static void printX(int X, int N){
        while(N > 0){
            System.out.print(X);
            N--;
            if(N != 0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printX(7, 5);
    }
}
