package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern8

📝 Example:
    Input  : 5
    Output :
    *
   ***
  *****
 *******
*********

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-8
----------------------------------------
*/


public class pattern8 {
    public static void printPattern8(int n) {
        for(int i=n; i>0; i--){
            for(int k=0; k<n-i; k++){
                System.out.print(" ");
            }
            for(int j=0; j < (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern8(5);
    }
}
