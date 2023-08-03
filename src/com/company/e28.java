package com.company;

import java.util.Arrays;

//Find minimum number of Laptops required
//MediumAccuracy: 45.44%Submissions: 33+Points: 4
//Lamp
//Stand out from the crowd. Prepare with Complete Interview Preparation
//
//There are N jobs and the start and finish time of the jobs are given in arrays start[] and end[] respectively. Each job requires one laptop and laptops can't be shared. Find the minimum number of laptops required given that you can give your laptop to someone else when you are not doing your job.
//
//
//Example 1:
//
//Input:
//N = 3
//start[] = {1, 2, 3}
//end[] = {4, 4, 6}
//Output:
//3
//Explanation:
//We can clearly see that everyone's supposed to
//be doing their job at time 3. So, 3 laptops
//will be required at minimum.
//
//Example 2:
//
//Input:
//N = 3
//start[] = {1, 5, 2}
//end[] = {2, 6, 3}
//Output :
//1
//Explanation:
//All jobs can be done using 1 laptop only.
public class e28 {
    public static void main(String[] args) {
        int  N = 3;
        int start[] = {1, 5, 2};
        int end[] = {2, 6, 3};
        System.out.println(minLaptops(N, start, end));
    }

    public static int minLaptops(int N, int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int count = 0;
        int ans = 0;
        int i = 0 , j = 0;
        while(i<N){
            if(start[i] < end[j]){   // if it is true , then task must be taken place at diffrent time
                count++;
                ans = Math.max(ans,count);
                i++;
            }
            else{  // task taking place at the same time
                count--;
                j++;
            }
        }
        return ans;
    }
}
