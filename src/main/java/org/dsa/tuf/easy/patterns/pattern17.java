package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : pattern17

📝 Example:
    Input  : 5
    Output :
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-17
----------------------------------------
*/


public class pattern17 {
    public static void printPattern17(int n) {
        for(int i=0; i < n; i++){
            // Spaces
            for(int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }

            // Letters
            for(int k=65; k<65+i; k++){
                System.out.print((char)k);
            }

            // Spaces
            for(int l=65+i; l>=65; l--){
                System.out.print((char) l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern17(5);
    }

}


