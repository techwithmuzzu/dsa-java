package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Count all Digits of a Number

📝 Example:
    Input  : 556
    Output : 3

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/count-all-digits-of-a-number
----------------------------------------
*/

public class CountAllDigits {
    public static int countDigit(int n){
        if(n >= 0 && n <= 9) return 1;
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(456));
    }
}
