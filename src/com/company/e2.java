// check whether a character is in a string or not
package com.company;

public class e2 {
    public static void main(String[] args) {
        String name="Shivam";
        char target='d';
        System.out.println(searchInString(name,target));

    }

    public static boolean searchInString(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
