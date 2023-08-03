package com.company;

import java.util.Arrays;

// merge sort sorting
public class e38 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
        // time complexity : O(N * logN)
        // space complexity : O(N)
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left , right);

    }

    public static int[] merge(int[] first, int[] second){
        int[] ans = new int[first.length + second.length];

        int i =0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                ans[k] = first[i];
                i++;
            }
            else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            ans[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;
    }



}
