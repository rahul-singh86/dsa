package Strings;

import java.util.HashMap;

public class LongestSubString {

    //abcdabcdbb -->abcd
    public static void main(String[] args) {
        String test_case1="abcdabcdebb";
        String test_case2="abcdefbcded";
        System.out.println(longestSubString(test_case2));
        //System.out.println(isUnique("abcdabcde"));
        System.out.println(longestSubStringHashMap(test_case2));
    }


    public static int longestSubStringHashMap(String s){

        HashMap<Character,Integer> hmap=new HashMap<>();
        int maxlength=0;
        int count=0;
        int start=0;
        int end=0;
        while(start<=end && end <s.length()){
            char temp=s.charAt(end);
            if(!hmap.containsKey(temp)){
                hmap.put(temp,end);

            }else {
                 count=end-start+1;
                 start=end+1;
                 hmap.put(temp,hmap.get(temp)+end);
                 if(count>maxlength){
                     maxlength=count;
                 }
            }
            end++;
        }
        return maxlength-1;
    }



    static boolean isUnique(String s){
        boolean unique=false;
        for(char c : s.toCharArray()){
            if(s.indexOf(c)==s.lastIndexOf(c)){
                unique=true;
            }else{
                unique=false;
                break;
            }
        }
        return unique;
    }
// This is inefficient o(n3) solution. Better is to have Hashmap solution since if we see new character duplicate we dont need to find
// All Combination for that String
    public static int longestSubString(String s){
        int maxlength=0;
        int count=0;
       for(int i=0;i<s.length();i++){
           for(int j=i;j<=s.length();j++){
               String temp=s.substring(i,j);

               if(isUnique(temp)){

                   count=temp.length();
                   if(count>maxlength){
                       maxlength=count;
                   }
               }
           }
       }

        return maxlength;
    }

}
