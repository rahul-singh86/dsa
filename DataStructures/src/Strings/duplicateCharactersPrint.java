package Strings;

import java.util.Arrays;

public class duplicateCharactersPrint {
    //Java print a as duplicate character
    /*
        Cover Null Pointer
        Cover Exception
        Cover EdgeCases and RegEx
        Cover All Tests
        Optimized Solution based on ascii chars small characters a-z o(n)
     */

    public static void main(String[] args) {
        String TestCase_1="java";
        String TestCase_2=null;
        String TestCase_3="abcd";
        String TestCase_4=" helloh 123%*&*% ";
        String TestCase_5="a";

        findDuplicate(TestCase_1);
           findDuplicate(TestCase_2);
          findDuplicate(TestCase_3);
        findDuplicate(TestCase_4);
          findDuplicate(TestCase_5);

    }

    static void findDuplicate(String withduplicatecharacters){
        //HashMap -- > find all chars with count > 1 --> 0(n) +o(n) -- o(n)
        //Sort this string -- > aajv and then 0nlogn
        //ASCII(125) or UNICODE 255 or 26 assume that its all small characters

        int[] duplicatecount=new int[26];
        try {
            withduplicatecharacters = withduplicatecharacters.replaceAll("[^a-z]", "");
            for(int i=0;i<withduplicatecharacters.length();i++){
                int count=(int)withduplicatecharacters.charAt(i)-'a';
                if(duplicatecount[count] == 0){
                    duplicatecount[count] = 1;
                }else{
                    duplicatecount[count]+=1;
                }
            }//populate all the counts

            for(int i=0;i<duplicatecount.length;i++){
                if(duplicatecount[i]>1){
                    char temp=(char)(i+'a');
                    System.out.print(temp);
                }

            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
