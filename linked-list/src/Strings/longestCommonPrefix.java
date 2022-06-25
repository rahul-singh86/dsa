package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] testcase_1={"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] testcase_2={"Hello", "world"};
        System.out.println(longestCommonPrefixSorting(testcase_1));
        System.out.println(longestCommonPrefixSorting(testcase_2));

    }

    public static int longestCommonPrefixSorting(String[] s) {
        if(s.length == 1) return s[0].length();
        Arrays.sort(s);
        String baseString=s[0];
        String lastString=s[s.length-1];
        int i=1;
        while(i<baseString.length()){
            if(baseString.substring(0,i).equals(lastString.substring(0,i))){
                    i++;
                }else{
                    break;
                }
        }
        return i>1? baseString.substring(0,i).length(): -1;
    }

    public static int longestCommonPrefix(String[] s){
        if(s.length == 1) return s[0].length();
        Arrays.sort(s);
        String baseString=s[0];
        String finalString="";
        int length=-1;
        for(int i=0;i<baseString.length();i++){ // geek
            for(int j=1;j<s.length;j++){
                if(baseString.charAt(i) == s[j].charAt(i)){
                    continue;
                }else{
                    length=finalString.length()+1;
                    return length;
                }
            }
            finalString=finalString+baseString.charAt(i);
        }
        return length;
    }
}
