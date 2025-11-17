package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : GCD of Two Numbers

📝 Example:
    Input: n1 = 4, n2 = 6
    Output: 2
    Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6
                   Greatest Common divisor = 2.

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/gcd-of-two-numbers
----------------------------------------
*/

public class GCD {
    public static int GCD(int n1, int n2) {
        if(n1 == 0 || n2 == 0){
            return n1 == 0 ? n2 : n1;
        }
        if(n1 > n2){
            return GCD(n1-n2, n2);
        }else{
            return GCD(n2-n1, n1);
        }
    }
    public static void main(String[] args) {
        System.out.println(GCD(456, 256));
    }
}
