package Strings.StringBasics;

import java.util.Arrays;

public class chartoInt {

    // Convert String to Integer Array
    public static void main(String[] args) {
        String name="RahuL";
        String name_new="RahuL";
        System.out.println(Arrays.toString(charToIntConvertor(name)));
        int[] intarray=charToIntConvertor(name);
        System.out.println("Sum of int array is "+sumofintarray(charToIntConvertor(name)));
        System.out.println("Sum of int array is "+sumofintarray(charToIntConvertor(name_new)));
        System.out.println("String name and name_new are equal or not "+stringequalscasesensitive(name,name_new));
    }

    public static boolean stringequalscasesensitive(String s1, String s2){
        //Ternary Operation :- Condition ? output1 : output2
        System.out.println("Equals Value Opertor is " + String.valueOf(sumofintarray(charToIntConvertor(s1))));
        System.out.println("Equals Value Opertor is " + String.valueOf(sumofintarray(charToIntConvertor(s2))));
        System.out.println("Equals" + String.valueOf(sumofintarray(charToIntConvertor(s1))).equals(String.valueOf(sumofintarray(charToIntConvertor(s2)))));
        return sumofintarray(charToIntConvertor(s1)) == sumofintarray(charToIntConvertor(s2)) ? true : false;
    }


    public static int[] charToIntConvertor(String s){
        // Input = "RahuL" Output [82,97,104,117,76]
        // O(n)+ O(n) = O(N) TC = Time Complexity
        // O(N)+O(N)= O(N) = Space Complexity
        char[] temp=s.toCharArray();
        int []  finalarray=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int convertedintval=temp[i];
            finalarray[i]=convertedintval;
        }
       return finalarray;
    }

    public static int sumofintarray(int arr[]){
        int sum=0;
        for(int value : arr){
            sum+=value; // sum=sum+value;
        }
        return sum;
    }

}
