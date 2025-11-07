package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : pattern13

📝 Example:
    Input  : 5
    Output :
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-13
----------------------------------------
*/


public class pattern13 {
    public static void printPattern13(int n) {
        int a = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern13(5);
    }

}


