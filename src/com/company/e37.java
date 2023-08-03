package com.company;
// 41. First Missing Positive
// https://leetcode.com/problems/first-missing-positive/description/
//Hard
//12.9K
//1.5K
//Companies
//
//Given an unsorted integer array nums, return the smallest missing positive integer.
//
//You must implement an algorithm that runs in O(n) time and uses constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//
//Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.
//
//Example 3:
//
//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.
public class e37 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int ans =firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        for(int i =0;i < nums.length ;i++){
            if(nums[i] != i + 1){
                return i+1;
            }
        }
        return nums.length + 1;
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 &&  arr[i] < arr.length && arr[correct] != arr[i]){
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
