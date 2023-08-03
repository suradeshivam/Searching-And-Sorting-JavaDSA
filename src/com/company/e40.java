package com.company;

import java.util.Arrays;

// quick sort sorting
public class e40 {
    public static void main(String[] args) {
        int[] arr = {1,23,56,23,78,2324,455,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        // pivot : choose and element -->   after first parse
        //          all the elements less than pivot will be at LHS of pivot
        //          and all the greater than pivot will be at RHS of the pivot
        // low & high --> main --> which part of array we are working on
        // start and end --> for swapping
        //   [----- pivot ---------]
        //      K     1     N-K-1
        // recurrence relation of quick sort :-   T(N) = T(K) + T(N-K-1) + O(N)

        // worst case :-  pivot is found to be smallest or largest element in the array
        // eg {1,2,3,4,6,7,8} let pivot be 8
        // K = 0;
        // thus, T(N) = T(0) + T(N-1) + O(N)
        //   = O(N^2)

        // best case :- pivot is the middle element of sorted form of array
        // T(N) = T(N / 2) + T(N / 2) + O(N)
        // T(N) = 2T(N / 2) + O(N)
        //       = O(N * logN)

        // Notes : not stable
        //          in place algorithm, no extra space is required
        //          merge sort is better in linked list due to memory allocation is not continuous
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = (s+e) /2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            // it is also a reason that if arr is already sorted it will not sort again
            if(s <= e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        // now the pivot is at correct index, we need to sort the two halves
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}
