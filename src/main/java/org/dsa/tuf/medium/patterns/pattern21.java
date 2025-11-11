package org.dsa.tuf.medium.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern21

📝 Example:
    Input  : 5
    Output :
        *****
        *   *
        *   *
        *   *
        *****

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-21
----------------------------------------
*/

public class pattern21 {
    public static void main(String[] args) {
        printPattern21(5);
    }

    public static void printPattern21(int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
