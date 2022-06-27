package Strings;

import java.util.ArrayList;

public class PermutationOfStrings {
    //abc-> acb abc bac bca cab cba
    public static void main(String[] args) {
       permute("","ABC");
    }
/*
        Algo is to fix one character and permutate or do recursive call in rest of the String
        1) It fixes A with perm+word.charAt(i) call for i=0
        2) it then slices word agrument with word.substring(0,0)+word.substring(1)) as BC
        3) so 1st Recursive Call at i=0 will be permute(A,BC) and goes till all word is empty then it prints perm
 */
    public static void permute(String perm,String word){
        if(word.isEmpty()){
           System.out.println(word+perm);
        }else{
           for(int i=0;i<word.length();i++){
                permute(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1));
           }
        }
    }
}
