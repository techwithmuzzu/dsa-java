package org.dsa.tuf.medium.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Medium
💡 Problem     : pattern20

📝 Example:
    Input  : 5
    Output :
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-20
----------------------------------------
*/


public class pattern20 {
    public static void printPattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2 * (n - i); k > 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = n - 1; a > 0; a--) {
            for (int b = a; b > 0; b--) {
                System.out.print("*");
            }
            for (int c = 2 * (n - a); c > 0; c--) {
                System.out.print(" ");
            }
            for (int d = a; d > 0; d--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern20(5);
    }
}


