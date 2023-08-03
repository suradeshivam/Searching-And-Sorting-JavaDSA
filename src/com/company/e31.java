package com.company;

import java.util.Arrays;

// cyclic sort
// v.imp   when we are given numbers in array are from 1 to n use cyclic sort
public class e31 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] == arr[i]){
                i++;
            }
            else{
                swap(arr,i,correct);
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
