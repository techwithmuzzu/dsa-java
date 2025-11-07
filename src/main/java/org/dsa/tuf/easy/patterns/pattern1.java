package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern1

📝 Example:
    Input  : 5
    Output :
        *****
        *****
        *****
        *****
        *****

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/language-basics/print-x-n-numbers-of-times
----------------------------------------
*/


public class pattern1 {
    public static void printPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern1(5);
    }
}
