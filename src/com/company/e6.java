package com.company;
// find no of no's which contains even no of digits in an array.
public class e6 {
    public static void main(String[] args) {
        int[] nums = {12,3452,2,0,6,7896,-88};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean even(int a){
        if(a<0){
            a=a * (-1);
        }
        if(a==0){
            return false;
        }
        int noOfDigits=digits2(a);
        if(noOfDigits%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    // in this method the time complexity increases as the no has incresed no of digits
//    public static int digits(int a){
//        int count=0;
//        while(a>0){
//            a=a/10;
//            count++;
//        }
//        return count;
//    }

// in this method time complexity is O(n) that is for iterating the loop only
    public static int digits2(int a){
        return (int)(Math.log10(a))+1;
    }
}
