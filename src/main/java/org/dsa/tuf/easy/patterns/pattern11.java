package org.dsa.tuf.easy.patterns;

/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Patterns
🎯 Level      : Easy
💡 Problem     : Pattern11

📝 Example:
    Input  : 5
    Output :
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/patterns/pattern-11
----------------------------------------
*/


public class pattern11 {
    public static void printPattern11(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2 == 1){
                    System.out.print((j%2) + " ");
                }else{
                    System.out.print((j%2 == 1) ? 0 + " " : 1 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern11(5);
    }

}


