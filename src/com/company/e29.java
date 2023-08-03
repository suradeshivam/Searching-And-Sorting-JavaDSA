// selection sort sorting
// sort a given array using selection sort
package com.company;

import java.util.Arrays;

public class e29 {
    public static void main(String[] args) {
        int[] arr = {1,6,0,2,9,7,81};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i = start; i <= last; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
