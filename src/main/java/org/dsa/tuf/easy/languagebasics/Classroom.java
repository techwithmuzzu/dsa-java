package org.dsa.tuf.easy.languagebasics;

/*
    Topic: Java Language Basics
    Sub-Topic: if else if
    Level: Very Easy
    Question link: https://takeuforward.org/plus/dsa/beginner-problem/language-basics/if-elseif
*/

public class Classroom {
    public static void Marks(int marks) {
        if(marks >= 90){
            System.out.print("Grade A");
        }else if(marks >= 70){
            System.out.print("Grade B");
        }else if(marks >= 50){
            System.out.print("Grade C");
        }else if(marks >= 35){
            System.out.print("Grade D");
        }else{
            System.out.print("Fail");
        }
    }
    public static void main(String[] args) {
        Marks(50);
    }
}
