package com.company;
// 287. Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/description/
//Medium
//17.8K
//2.5K
//Companies
//
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [1,3,4,2,2]
//Output: 2
//
//Example 2:
//
//Input: nums = [3,1,3,4,2]
//Output: 3
public class e34 {
    public static void main(String[] args) {
        int[] arr= {1,4,4,3,2};
        int ans= findDuplicate(arr);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return -1;
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
