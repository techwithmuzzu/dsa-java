package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern4

📝 Example:
    Input  : 5
    Output :
        1
        22
        333
        4444
        55555

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-1
----------------------------------------
*/


public class pattern4 {
    public static void printPattern4(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern4(5);
    }
}
