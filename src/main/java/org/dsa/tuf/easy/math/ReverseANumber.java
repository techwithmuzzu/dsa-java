package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Reverse a number

📝 Example:
    Input  : 256
    Output : 652

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/reverse-a-number
----------------------------------------
*/

public class ReverseANumber {
    public static int reverseNumber(int n) {
        int revNum = 0;
        int lastDigit = 0;
        while(n > 0){
            lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(456));
    }
}
