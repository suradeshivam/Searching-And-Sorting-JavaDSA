package com.company;

import java.util.ArrayList;

// 442. Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
//Medium
//7.9K
//298
//Companies
//
//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//
//You must write an algorithm that runs in O(n) time and uses only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
//
//Example 2:
//
//Input: nums = [1,1,2]
//Output: [1]
//
//Example 3:
//
//Input: nums = [1]
//Output: []
public class e35 {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list= findDuplicates(arr);
        System.out.println(list.toString());
    }

    public static ArrayList<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1 ;
            if(arr[correct] != arr[i]){
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
