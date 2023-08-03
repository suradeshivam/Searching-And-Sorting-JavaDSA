package com.company;

import java.util.Arrays;

// insertion sort
// sort the array using insertion sort
public class e30 {
    public static void main(String[] args) {
        int[] arr = {2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 0;i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr ,j, j-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    // Time Complexity :
    // best case : O(N)
    // worst case : O(N^2)
}


