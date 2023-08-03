package com.company;
// order agnostic binary search
// how to apply binary search if we don't know array is ascending arr descending ordered.
public class e9 {
    public static void main(String[] args) {
        int[] arr = {90,89,78,67,56,45,34,23,12};
        int ans = binarySearch(arr,12);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr,int num){
        int start=0;
        int end=arr.length-1;

        if(arr[start]<arr[end]) {
            while (start <= end) {
                int middle = (start + (end - start) / 2);
                if (arr[middle] == num) {
                    return middle;
                }
                if (arr[middle] > num) {
                    end = middle - 1;
                }
                if (arr[middle] < num) {
                    start = middle + 1;
                }
            }
        }
        else{
            while (start <= end) {
                int middle = (start + (end - start) / 2);
                if (arr[middle] == num) {
                    return middle;
                }
                if (arr[middle] > num) {

                    start = middle + 1;
                }
                if (arr[middle] < num) {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }

}
