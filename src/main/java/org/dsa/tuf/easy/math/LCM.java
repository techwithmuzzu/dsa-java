package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : LCM of two numbers

📝 Example:
    Input: n1 = 4, n2 = 6
    Output: 12
    Explanation: 4 * 3 = 12, 6 * 2 = 12.
                12 is the lowest integer that is divisible both 4 and 6.

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/lcm-of-two-numbers
----------------------------------------
*/

public class LCM {
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
    public static int LCM(int n1, int n2) {
        return (n1 * n2) / GCD(n1, n2);
    }
    public static void main(String[] args) {
        System.out.println(LCM(456, 256));
    }
}
