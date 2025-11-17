package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Count number of odd digits in a number

📝 Example:
    Input  : 25
    Output : 1

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/count-number-of-odd-digits-in-a-number
----------------------------------------
*/

public class CountNoOddDigits {
    public static int countOddDigit(int n) {
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            if(((n % 10) % 2) != 0) count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOddDigit(456));
    }
}
