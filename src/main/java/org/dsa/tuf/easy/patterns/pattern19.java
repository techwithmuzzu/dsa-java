package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : pattern19

📝 Example:
    Input  : 5
    Output :
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-19
----------------------------------------
*/


public class pattern19 {
    public static void printPattern19(int n) {
        // Upper Half or the Rhombus in a square
        for(int i=n; i>0; i--){
            // stars
            for(int a=i; a>0; a--){
                System.out.print("*");
            }
            // spaces
            for(int b=0; b<2*(n-i); b++){
                System.out.print(" ");
            }
            // Stars
            for(int c=i; c>0; c--){
                System.out.print("*");
            }

            System.out.println();
        }


        // Lower Half of the Rhombus in a square
        for(int j=1; j<= n; j++){
            // Stars
            for(int k=1; k<=j; k++){
                System.out.print("*");
            }

            // spaces
            for(int l=2*n-(j*2); l>0; l--){
                System.out.print(" ");
            }
            // Stars
            for(int m=1; m<=j; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern19(5);
    }
}


