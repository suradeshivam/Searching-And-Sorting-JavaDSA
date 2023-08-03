package com.company;
//69. Sqrt(x)
//Easy
//5.5K
//3.8K
//Companies
//
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
// 
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
public class e26 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));

    }

    public static int mySqrt(int x) {
        if(x < 2) return x;
        int ans = 0;
        int i = 0;
        int j = x;
        while(i <= j){
            int mid = i + (j - i)/2;
            long multiply = (long) mid * mid;
            if(multiply == x){
                return mid;
            }
            if(multiply < x){
                ans = mid;
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return ans;
    }
}
