package org.dsa;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int mostFrequentElement(int[] nums) {
        // Finding Maximum Element
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        // Hashing the values - Create a new Hashing Array
        int[] hash = new int[max + 1];
        for(int j=0; j<nums.length; j++){
            hash[nums[j]] += 1;
        }
        // Finding Second Maximum occurring Element
        int highestOccuringElement = -1;
        int highestOccuringElementCount = 0;
        int lowestOccuringElement = Integer.MAX_VALUE;
        int lowestOccuringElementCount = 0;


        for(int k=0; k<hash.length; k++){
            if(hash[k] == 0){
                continue;
            }else if(hash[k] > highestOccuringElementCount){
                highestOccuringElement = k;
                highestOccuringElementCount = hash[k];
            }else{
                if(hash[k] < lowestOccuringElementCount){
                    lowestOccuringElement = k;
                    lowestOccuringElementCount = hash[k];
                }
            }
        }
        System.out.println(highestOccuringElementCount);
        System.out.println(lowestOccuringElementCount);
        return highestOccuringElementCount + lowestOccuringElementCount;


    }
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6, 7};
        System.out.println(mostFrequentElement(arr));
    }
}