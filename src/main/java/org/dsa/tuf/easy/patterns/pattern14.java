package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : pattern14

📝 Example:
    Input  : 5
    Output :
A
AB
ABC
ABCD
ABCDE

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-14
----------------------------------------
*/


public class pattern14 {
    public static void printPattern14(int n) {
        for(int i = 65; i < (65+n); i++){
            for(int j = 65; j <= i; j++){
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern14(5);
    }

}


