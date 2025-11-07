package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern12

📝 Example:
    Input  : 5
    Output :
1        1
12      21
123    321
1234  4321
1234554321

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-12
----------------------------------------
*/


public class pattern12 {
    public static void printPattern12(int n) {
        for(int a=1; a<=n; a++){
            // First series of numbers
            for(int j=1; j<=a; j++){
                System.out.print(j);
            }

            //First series of spaces
            for(int i=(2*n-(a*2)); i>0; i--){
                System.out.print(" ");
            }

            // Last series of numbers
            for(int k=a; k>=1; k--){
                System.out.print(k);
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern12(5);
    }

}


