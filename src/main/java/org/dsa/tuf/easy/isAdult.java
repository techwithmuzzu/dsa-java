package org.dsa.tuf.easy;
/*
    Topic: Java Language Basics
    Sub-Topic: if else
    Level: Very Easy
    Question link: https://takeuforward.org/plus/dsa/beginner-problem/language-basics/if-else-adult-teen-problem
*/

public class isAdult {
    public static void isAdultt(int age) {
        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Teen");
        }
    }

    public static void main(String[] args) {
        isAdultt(56);
    }
}
