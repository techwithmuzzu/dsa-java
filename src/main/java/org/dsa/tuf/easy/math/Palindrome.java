package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Is Palindrome

📝 Example:
    Input  : 121
    Output : true

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/palindrome-number
----------------------------------------
*/

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int revNum = 0;
        int lastDigit = 0;
        int copy = n;
        while(n > 0){
            lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        return revNum == copy;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(456));
    }
}
