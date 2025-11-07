package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern7

📝 Example:
    Input  : 5
    Output :
    *
   ***
  *****
 *******
*********

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-7
----------------------------------------
*/


public class pattern7 {
    public static void printPattern7(int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k< (2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern7(5);
    }
}
