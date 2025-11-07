package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern3

📝 Example:
    Input  : 5
    Output :
        1
        12
        123
        1234
        12345

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/language-basics/print-x-n-numbers-of-times
----------------------------------------
*/


public class pattern3 {
    public static void printPattern3(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern3(5);
    }
}
