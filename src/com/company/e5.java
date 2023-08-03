// search in 2D array

package com.company;

public class e5 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {23,44,55,66},
                {-12,-98}
        };

        System.out.println(searchIn2D(arr,90));
    }

    public static boolean searchIn2D(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
