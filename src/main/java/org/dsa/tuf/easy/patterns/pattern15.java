package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : pattern15

📝 Example:
    Input  : 5
    Output :
ABCDE
ABCD
ABC
AB
A

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-15
----------------------------------------
*/


public class pattern15 {
    public static void printPattern15(int n) {
        for(int i=0; i<n; i++){
            for(int j=65; j<65+n-i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern15(5);
    }

}


