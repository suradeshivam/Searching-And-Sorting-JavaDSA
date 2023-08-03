package com.company;

import java.util.Arrays;
// searching in sorted array with binary search
public class e24 {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160}
        };
        System.out.println(Arrays.toString(search(arr , 40)));
    }

    // search in the row provided between the column provided
    static int[] binarySearch(int matrix[][], int target, int row, int cStart, int cEnd){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row , mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }

        }
        return new int[]{-1 , -1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            binarySearch(matrix, target, 0, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = (cols / 2);

        while(rStart < (rEnd -1)){
            int mid = rStart + (rEnd - rStart)/ 2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid , cMid};
            }
            if(matrix[mid][cMid] < target){

                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }


        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        // first half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }
        // second half
        if(target >= matrix[rStart][cMid + 1]){
           return  binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }
        // third half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        }
        // fourth half
        else{
            return  binarySearch(matrix, target, rStart + 1, cMid + 1, cols - 1);
        }

    }

}

//import java.util.Arrays;
//
//public class e24 {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {10,20,30,40},
//                {50,60,70,80},
//                {90,100,110,120},
//                {130,140,150,160}
//        };
//        System.out.println(Arrays.toString(search(arr, 40)));
//    }
//
//    // search in the row provided between the cols provided
//    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
//        while (cStart <= cEnd) {
//            int mid = cStart + (cEnd - cStart) / 2;
//            if (matrix[row][mid] == target) {
//                return new int[]{row, mid};
//            }
//            if (matrix[row][mid] < target) {
//                cStart = mid + 1;
//            } else {
//                cEnd = mid - 1;
//            }
//        }
//        return new int[]{-1, -1};
//    }
//
//    static int[] search(int[][] matrix, int target) {
//        int rows = matrix.length;
//        int cols = matrix[0].length; // be cautious, matrix may be empty
//        if (cols == 0){
//            return new int[] {-1,-1};
//        }
//        if (rows == 1) {
//            return binarySearch(matrix,0, 0, cols-1, target);
//        }
//
//        int rStart = 0;
//        int rEnd = rows - 1;
//        int cMid = cols / 2;
//
//        // run the loop till 2 rows are remaining
//        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
//            int mid = rStart + (rEnd - rStart) / 2;
//            if (matrix[mid][cMid] == target) {
//                return new int[]{mid, cMid};
//            }
//            if (matrix[mid][cMid] < target) {
//                rStart = mid;
//            } else {
//                rEnd = mid;
//            }
//        }
//
//        // now we have two rows
//        // check whether the target is in the col of 2 rows
//        if (matrix[rStart][cMid] == target) {
//            return new int[]{rStart, cMid};
//        }
//        if (matrix[rStart + 1][cMid] == target) {
//            return new int[]{rStart + 1, cMid};
//        }
//
//        // search in 1st half
//        if (target <= matrix[rStart][cMid - 1]) {
//            return binarySearch(matrix, rStart, 0, cMid-1, target);
//        }
//        // search in 2nd half
//        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
//            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
//        }
//        // search in 3rd half
//        if (target <= matrix[rStart + 1][cMid - 1]) {
//            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
//        } else {
//            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
//        }
//    }
//}


