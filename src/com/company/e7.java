package com.company;
//1672. Richest Customer Wealth
//        Easy
//
//        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
//
//        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//
//
//
//        Example 1:
//
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

public class e7 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{9,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum + accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
