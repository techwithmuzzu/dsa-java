package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern2

📝 Example:
    Input  : 5
    Output :
        *
        **
        ***
        ****
        *****

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/language-basics/print-x-n-numbers-of-times
----------------------------------------
*/


public class pattern2 {
    public static void printPattern2(int n) {
        for(int i = 0; i < n; i++){
            for(int j=0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern2(5);
    }
}
