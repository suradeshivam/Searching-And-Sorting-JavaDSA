// linear search
// search an element in the array
// if element found return the index of the element else return -1

package com.company;

public class e1 {
    public static void main(String[] args) {
        int[] arr={12,33,55,63,88,33,-2,-89};
        int ans=linearSearch(arr,-2);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int n){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
