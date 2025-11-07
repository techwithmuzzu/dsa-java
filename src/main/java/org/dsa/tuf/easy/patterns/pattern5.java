package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern5

📝 Example:
    Input  : 5
    Output :
        1
        22
        333
        4444
        55555

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-5
----------------------------------------
*/


public class pattern5 {
    public static void printPatter5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatter5(5);
    }
}
