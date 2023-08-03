package com.company;

import java.util.Arrays;

//Aggressive Cows
//MediumAccuracy: 39.95%Submissions: 1513Points: 4
//
//You are given an array consisting of n integers which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
//The first line of input contains two space-separated integers n and k.
//The second line contains n space-separated integers denoting the position of the stalls.
//
//Example 1:
//
//Input:
//n=5
//k=3
//stalls = [1 2 4 8 9]
//Output:
//3
//Explanation:
//The first cow can be placed at stalls[0],
//the second cow can be placed at stalls[2] and
//the third cow can be placed at stalls[3].
//The minimum distance between cows, in this case, is 3,
//which also is the largest among all possible ways.
public class e15 {
    public static void main(String[] args) {
        int[] stalls= {1,2,4,8,9};
        int k=3;
        int n=5;
        int ans=solve(n,k,stalls);
        System.out.println(ans);
    }

    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int lo=0,hi=stalls[stalls.length-1];
        int ans=0;
        while(lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(isValid(stalls,k,mid)) {
                ans = Math.max(ans,mid);
                lo=mid+1;
            } else {
                hi=mid-1;
            }
        }
        return ans;
    }

    public static boolean isValid(int[] a,int k,int dis) {
        int pidx=0;
        for(int i=1;i<a.length;i++) {
            if(a[i]-a[pidx]>=dis) {
                k--;
                pidx=i;
            }
        }
        return k<=1;
    }
}
