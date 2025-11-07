package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern6

📝 Example:
    Input  : 5
    Output :
        12345
        1234
        123
        12
        1

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-6
----------------------------------------
*/


public class pattern6 {
    public static void printPattern6(int n) {
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern6(5);
    }
}
