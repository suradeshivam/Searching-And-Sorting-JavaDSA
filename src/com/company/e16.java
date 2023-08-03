package com.company;
//852. Peak Index in a Mountain Array
//Medium
//4.2K
//1.8K
//Companies
//
//An array arr a mountain if the following properties hold:
//
//    arr.length >= 3
//    There exists some i with 0 < i < arr.length - 1 such that:
//        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//
//Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
//
//You must solve it in O(log(arr.length)) time complexity.
//
// 
//
//Example 1:
//
//Input: arr = [0,1,0]
//Output: 1
//
//Example 2:
//
//Input: arr = [0,2,1,0]
//Output: 1
public class e16 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,10,24,100,5,2};
        int ans= peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}
