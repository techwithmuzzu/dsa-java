package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern10

📝 Example:
    Input  : 5
    Output :
*
**
***
****
*****
****
***
**
*

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-10
----------------------------------------
*/


public class pattern10 {
    public static void printPattern10(int n) {
        // Upper Half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half
        for (int a = n - 1; a > 0; a--) {
            for (int k = a; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern10(5);
    }

}


