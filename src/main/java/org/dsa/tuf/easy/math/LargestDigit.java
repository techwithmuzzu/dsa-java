package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Factorial of a given number

📝 Example:
    Input: n = 2
    Output: 2
    Explanation: 2! = 1 * 2 = 2.

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/factorial-of-a-given-number-i
----------------------------------------
*/

public class LargestDigit {
    public static int factorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(456));
    }
}
