package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : pattern16

📝 Example:
    Input  : 5
    Output :
A
BB
CCC
DDDD
EEEEE

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-16
----------------------------------------
*/


public class pattern16 {
    public static void printPattern16(int n) {
        for(int i=65; i<(65+n); i++){
            for(int j=65; j<=i; j++){
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern16(5);
    }

}


