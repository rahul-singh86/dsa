package Strings.ReverseAndRotation;

import java.util.ArrayList;

public class RotationStringChecker {
    /*
        Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
        (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)

     */

    static boolean isRotation(String s1,String s2){
        String temp=s1+s1;
        ArrayList<String> results=new ArrayList<>();
        for(int i=1;i<=s1.length();i++){
            String substr=temp.substring(i,i+s1.length());

            results.add(substr);
        }
        System.out.print(results);

        if(results.contains(s2)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(isRotation("abcd","cdab"));
    }
}
