package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Check for Prime Number

📝 Example:
    Input: n = 5
    Output: true
    Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/check-for-prime-number
----------------------------------------
*/

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(456));
    }
}
