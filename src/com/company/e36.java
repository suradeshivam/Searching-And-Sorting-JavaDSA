package com.company;

import java.util.Arrays;

// 645. Set Mismatch
// https://leetcode.com/problems/set-mismatch/description/
//Easy
//3.4K
//792
//Companies
//
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//
//
//Example 1:
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
//
//Example 2:
//
//Input: nums = [1,1]
//Output: [1,2]
public class e36 {
    public static void main(String[] args) {
         int[] nums = {1,2,2,4};
         int[] ans =findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        for(int i = 0 ;i< nums.length;i++){
            if(nums[i] != i + 1){
                return new int[]{nums[i], i+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]  -1 ;
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
