package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Count of Prime Numbers till N

📝 Example:
    Input: n = 6
    Output: 3
    Explanation: Prime numbers in the range [1, 6] are 2, 3, 5.

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/count-of-prime-numbers-till-n
----------------------------------------
*/

public class NoOfPrimes {
    public static boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int primeUptoN(int n) {
        int count = 0;
        for(int i=0; i<=n; i++){
            if(isPrime(i)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(primeUptoN(456));
    }
}
