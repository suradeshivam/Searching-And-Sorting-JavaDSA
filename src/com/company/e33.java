package com.company;
//448. Find All Numbers Disappeared in an Array
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//Easy
//7.9K
//425
//Companies
//
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]
import java.util.ArrayList;

public class e33 {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        ArrayList<Integer> list =findDisappearedNumbers(arr);
        System.out.println(list.toString());
    }
        public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
            cyclicSort(nums);
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i= 0;i< nums.length;i++){
                if(nums[i] != i+1){
                    list.add(i+1);
                }
            }

            return list;
        }

        public static void cyclicSort(int[] arr){
            int i = 0;
            while(i < arr.length){
                int correct = arr[i] -1;
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
