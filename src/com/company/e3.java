// search any element in a particular range


package com.company;

public class e3 {
    public static void main(String[] args) {
        int[] arr={12,56,78,21,76,9,-44,-77};
        System.out.println(search(arr,2,4,-44));

    }

    public static boolean search(int[] arr, int start, int end, int target){
        if(arr.length==0){
            return false;
        }

        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
