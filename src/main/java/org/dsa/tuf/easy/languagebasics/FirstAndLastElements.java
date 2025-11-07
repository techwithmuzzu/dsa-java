package org.dsa.tuf.easy.languagebasics;

/*
    Topic: Java Language Basics
    Sub-Topic: Array
    Level: Easy
    Name of the question: Sum of first and last elements in an array
    Question link: https://takeuforward.org/plus/dsa/beginner-problem/language-basics/switch-case
*/

public class FirstAndLastElements {
    public static int sumOfFirstAndLast(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int first = nums[0];
        int last = nums[nums.length-1];
        return first+last;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 56, 102};
        System.out.println(sumOfFirstAndLast(arr));
    }
}
