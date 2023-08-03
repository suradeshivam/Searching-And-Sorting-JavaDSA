package com.company;
// ceiling of a number
//smallest no in the array greater than or equal to target
public class e10 {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6,7,12,16,17,19};
        System.out.println(ceiling(arr,12));
    }

    public static int ceiling(int[] arr,int target){
        // if target element is greater than the greatest element in the array
        if(target > arr[arr.length-1]){
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
        return arr[start];
    }
}
