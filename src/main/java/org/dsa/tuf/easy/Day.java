package org.dsa.tuf.easy;

/*
    Topic: Java Language Basics
    Sub-Topic: Switch case
    Level: Very Easy
    Question link: https://takeuforward.org/plus/dsa/beginner-problem/language-basics/switch-case
*/

public class Day {
    public static void whichDay(int day) {
        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid");
        }
    }

    public static void main(String[] args) {
        whichDay(5);
    }
}
