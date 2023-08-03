package com.company;
// floor of any no
// greatest no in the array smaller than or equal to target
public class e11 {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6,7,12,16,17,19};
        System.out.println(ceiling(arr,-1));
    }

    public static int ceiling(int[] arr,int target){
        // if target element is smaller than the smallest element in the array;
        if(target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(arr[middle]==target){
                return arr[middle];
            }
            if(arr[middle]<target){
                start=middle+1;
            }
            if(arr[middle]>target){
                end=middle-1;
            }
        }
        return arr[end];
    }
}