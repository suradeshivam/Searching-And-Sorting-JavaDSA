package com.company;

import java.util.Arrays;

// bubble sort sorting
public class e25 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //run the steps n-1 times
    static void bubbleSort(int[] arr){
        boolean swapped = false;
        for(int i = 0; i < arr.length ; i++){
            // for each step max item will come at the last respective index
            for(int j = 1; j < arr.length; j++){
                // swap if the item is smaller than previous item
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // if array is already sorted then we will break the loop
            if(!swapped){
                break;
            }
        }
    }
}
