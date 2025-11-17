package org.dsa.tuf.easy.math;
/*
----------------------------------------
🧩 Topic      : Java Language Basics
📚 Sub-Topic  : Basic Maths
🎯 Level      : Easy
💡 Problem     : Divisors of a Number

📝 Example:
    Input: n = 6
    Output = [1, 2, 3, 6]
    Explanation: The divisors of 6 are 1, 2, 3, 6.

🔗 Link : https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/divisors-of-a-number
----------------------------------------
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Divisors {
    public static int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0) list.add(i);
        }
        int[] arr = new int[list.size()];
        for(int j=0; j<arr.length; j++){
            arr[j] = list.get(j);
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(456)));
    }
}
