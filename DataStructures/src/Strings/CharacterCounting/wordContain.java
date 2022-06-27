package Strings.CharacterCounting;

import java.util.HashSet;

public class wordContain {

    //Given an array of words and a string, we need to count all words that are present in given string.
    /*
    Examples:

Input : words[] = { "welcome", "to", "geeks", "portal"}
            str = "geeksforgeeks is a computer science portal for geeks."
Output :  2
Two words "portal" and "geeks" is present in str.


Input : words[] = {"Save", "Water", "Save", "Yourself"}
        str     = "Save"
Output :1

     */

    public static int wordContain(String str[],String s){
        int result=0;
        HashSet<String> wordset=new HashSet<>();
        s=s.replaceAll("[^a-zA-Z ]","");
        String word[]=s.split(" ");
        for(String wrd : word){
            wordset.add(wrd);
        }

        for(String s1 :str){
            if(wordset.contains(s1)){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String words[]={"welcome", "to", "geeks", "portal"};
        String word="geeksforgeeks is a computer science portal for geeks.";
        System.out.print(wordContain(words,word));
    }
}
