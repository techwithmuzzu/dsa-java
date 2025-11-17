package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Check for Perfect Number

📝 Example:
    Input: n = 6
    Output: true
    Explanation: Proper divisors of 6 are 1, 2, 3. 1 + 2 + 3 = 6.

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/check-for-perfect-number
----------------------------------------
*/

public class PerfectNumber {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return n == sum;
    }
    public static void main(String[] args) {
        System.out.println(isPerfect(456));
    }
}
