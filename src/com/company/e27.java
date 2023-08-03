package com.company;
// you not solved the question
// 4. Median of Two Sorted Arrays
//Hard
//21.3K
//2.4K
//Companies
//
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
// 
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
public class e27 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1 , nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int low1=0;
        int low2=0;
        int i=0;
        while(low1<nums1.length && low2<nums2.length){
            if(nums1[low1] <= nums2[low2]){
                arr[i]=nums1[low1];
                low1++;
            }
            else{
                arr[i]=nums2[low2];
                low2++;
            }
            i++;
        }
        if(low1 < nums1.length){
            for(int k=low1;k<nums1.length;k++){
                arr[i]=nums1[k];
                i++;
            }
        }
        if(low2 < nums2.length){
            for(int k=low2;k<nums2.length;k++){
                arr[i]=nums2[k];
                i++;
            }
        }
        int n = arr.length;
        return n%2==0? (arr[n/2] + arr[(n/2)-1])/2.0 : arr[n/2];
    }
}
