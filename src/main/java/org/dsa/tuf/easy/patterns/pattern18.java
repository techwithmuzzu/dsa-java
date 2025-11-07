package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : pattern18

📝 Example:
    Input  : 5
    Output :
E
D E
C D E
B C D E
A B C D E

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-18
----------------------------------------
*/


public class pattern18 {
    public static void printPattern18(int n) {
        for(int i=0; i<n; i++){
            for(int j=64+n-i; j<65+n; j++){
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern18(5);
    }

}


