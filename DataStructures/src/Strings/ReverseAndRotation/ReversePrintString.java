package Strings.ReverseAndRotation;

import java.util.Stack;

public class ReversePrintString {
    /*
    Let the input string be “i like this program very much”. The function should change the string to “much very program this like i”

     */

    //Approach 2
    public static String reverseApproach(String s){
        StringBuffer br=new StringBuffer();
        String[] words_new=s.split(" ");
        for(int i=words_new.length-1;i>=0;i--){
            br.append(words_new[i]);
            br.append(" ");
        }
        return br.toString().trim();
    }


    //Approach 1
    public static String stackApproach(String s){
        Stack<String> words=new Stack<>();
        StringBuffer br=new StringBuffer();
        String[] words_new=s.split(" ");
        for(String word : words_new){
            words.push(word);
        }
        while(!words.isEmpty()){
           br.append(words.pop());
           br.append(" ");
        }
        return br.toString();
    }

    public static void main(String[] args) {
        System.out.print(reverseApproach("i like this program very much").trim());
    }

}
