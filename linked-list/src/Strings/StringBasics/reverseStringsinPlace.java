package Strings.StringBasics;

import java.util.Arrays;
/*
    1 . Exception Handling through Try Catch Block
    2.  All Test Cases such as Null Space RegEx


 */

public class reverseStringsinPlace {
    //How do you reverse a given string in place? "Rahul"

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String to be Revered ");
//        String test=sc.next();
        String test=null;
        System.out.println("Revered String is "+(reverseInPlace("Rahul")));
        System.out.println("Revered String is "+reverseInPlace("(*^*(^*"));
        System.out.println("Revered String is "+reverseInPlace("Rahul)(&)(&"));
        System.out.println("Revered String is "+reverseInPlace(" Rahul 698"));
        System.out.println("Revered String is "+reverseInPlace(test));
        System.out.println("Revered String is "+reverseInPlace("    "));
        System.out.println("Revered String is "+reverseInPlace("123456"));
        System.out.println("Revered String is "+reverseInPlace("Rahul Singh"));
        System.gc();
    }

/*
    1. Rahul
    2. (*^*(^*
    3. Rahul)(&)(&
    4.  Rahul 698
    5. Null
    6. Empty
    7. Space only
    8. 123456

 */

    // TC -> o(n) SC -> O(n)
    public static String reverseInPlace(String s){
       // if(s == null || s.isEmpty()) return s;
        //input  (%^(*% Rahul
        char[] schar=null;
        try{
        //s=s.replaceAll("\\s","");
        s=s.replaceAll("[^a-zA-Z ]+","").trim();
        schar=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        System.out.println(Arrays.toString(schar));
        while(start<=end){
            char temp=s.charAt(start);
            schar[start]=schar[end];
            schar[end]=temp;
            start++;
            end--;
        }
            return new String(schar);
    } catch (Exception e){
          System.out.println("Exception is "+e.toString());
       }

        return "";
    }


}
