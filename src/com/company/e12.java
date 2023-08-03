package com.company;
//744. Find Smallest Letter Greater Than Target
//        Easy
//        2.4K
//        1.9K
//        Companies
//
//        You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//        Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//
//         
//
//        Example 1:
//
//        Input: letters = ["c","f","j"], target = "a"
//        Output: "c"
//        Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

public class e12 {
    public static void main(String[] args) {
        char[] letters={'a','b','c','d','e'};
        char target ='c';
        char ans=findSmallestLetterGreaterThanTarget(letters,target);
        System.out.println(ans);

    }


    public static char findSmallestLetterGreaterThanTarget(char[] letters,char target){
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid= start + (end-(start))/2;
            if(target < letters[mid]){

                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return letters[start % letters.length ];
    }
}
