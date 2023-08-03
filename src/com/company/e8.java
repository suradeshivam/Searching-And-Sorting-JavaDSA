package com.company;
// Binary Search Algorithm
// return the index of the element
// return -1 if the element not found

public class e8 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        int ans = binarySearch(arr,40);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr,int num){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int middle=(start+(end-start)/2);
            if(arr[middle]==num){
                return middle;
            }
            if(arr[middle]>num){
                end=middle-1;
            }
            if(arr[middle]<num){
                start=middle+1;
            }
        }
        return -1;
    }




}
