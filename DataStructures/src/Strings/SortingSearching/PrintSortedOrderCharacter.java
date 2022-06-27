package Strings.SortingSearching;

import java.util.Arrays;

public class PrintSortedOrderCharacter {
    static final int MAX_CHAR=26;
    /* Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order.
    Input :  bbccdefbbaa
    Output : aabbbbccdef
     */

   /*
        1. Approach 1 --> Convert String into Array Char and then Apply Sort . Time Com -- nlogn and space o(n)
        2. Approach 2 --> Create HashedArray with alphabet and count and print it . Time Co--o(n) and space o(n)
         'a'-'a' --> 0 which will be letters[0] so if 2a are there it will be 2 in index 0 which means aa.
         (char)i+'a'--> meaning '0'+'a'--> will give a so this is the mechanism used to convert lowercase int to char also typecast it
    */

    //Approach no 1
    public static String sortString(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    //Approach no 2
    public static String stringHashSort(String s){
         int[] letters=new int[MAX_CHAR];
         StringBuffer sortedstring=new StringBuffer();
         for(char c : s.toCharArray()){
             letters[c-'a']+=1;
         }

         for(int i=0;i<letters.length;i++){
            char toappend = (char)(i+'a');
             int retrivedcount=letters[i];
            while(retrivedcount>0){
                sortedstring.append(toappend);
                retrivedcount--;
            }
         }
        return sortedstring.toString();
    }

    public static void main(String[] args) {
        String testcase1="bbccdefbbaa";
        String testcase2="geeksforgeeks";

        //TestCases
        System.out.println(sortString(testcase1));
        System.out.println(stringHashSort(testcase2));
    }
}
