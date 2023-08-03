// find maximum and minimum no in an array

package com.company;

public class e4 {
    public static void main(String[] args) {
        int[] arr={};
        maxMin(arr);
    }

    public static void maxMin(int[] arr){
        if(arr.length==0){
            System.out.println("array is empty");
            return;
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);
    }


}
