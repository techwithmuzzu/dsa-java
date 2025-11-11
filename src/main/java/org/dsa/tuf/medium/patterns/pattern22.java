package org.dsa.tuf.medium.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern22

📝 Example:
    Input  : 5
    Output :
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-22
----------------------------------------
*/

public class pattern22 {
    public static void main(String[] args) {
        printPattern22(5);
    }

    public static void printPattern22(int n) {
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                // Ignore warning for understanding
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, left), Math.min(right, bottom)) + " ");
            }
            System.out.println();
        }
    }
}
