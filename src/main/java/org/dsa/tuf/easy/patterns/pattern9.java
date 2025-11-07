package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern9

📝 Example:
    Input  : 5
    Output :
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-9
----------------------------------------
*/


public class pattern9 {
    public static void printPattern9(int n) {
        // upward pyramid
        for (int i = 0; i < n; i++) {
            // spaces
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }

            // stars
            for (int l = 0; l < (2 * i + 1); l++) {
                System.out.print("*");
            }

            // Printing new line after every line
            System.out.println();
        }
        // Downward pyramid (Inverted Pyramid)
        for (int j = n; j > 0; j--) {
            // spaces
            for (int a = 0; a < (n - j); a++) {
                System.out.print(" ");
            }

            // stars
            for (int b = (2 * j - 1); b > 0; b--) {
                System.out.print("*");
            }

            // Printing new line after every line
            System.out.println();

        }
    }
    public static void main(String[] args) {
        printPattern9(5);
    }
}
