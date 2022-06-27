package Strings.StringBasics;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringBasics {

    // Basics of String

    public static void main(String[] args) {
        String Test="Hellothisisstringtest";
        basicsofString(Test);
    }

    public static void basicsofString(String s){
        // Common Methods in Strings
        System.out.println("Length of String "+ s.length());
        System.out.println("Character at 2nd Index "+ s.charAt(2));
        char[] temp=s.toCharArray();
        int var1=10;
        System.out.println("Testing String value of func from int to string 10 value "+String.valueOf(var1));
        System.out.println("Testing String value of func "+String.valueOf(s.toCharArray()));
        System.out.println("String to Character Array conversion "+ Arrays.toString(temp));
        String s1="Rahul";
        String s2="Rahu";
        System.out.println("Lexographically Compare two Strings " + s1.compareTo(s2));
        System.out.println("Equals method is case sensistive will return false for Rahul and rahul - "+ "Rahul".equals("rahul"));
        System.out.println("S1 Ends with l"+s1.endsWith("l"));
        System.out.println("S2 Starts with R "+ s2.startsWith("R"));
        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        System.out.println("Left Justified 0s with String.format method is "+str3);
        System.out.println("String.getBytes operator used for getting UTF-8 Unicode Value of A is "+"A".getBytes(StandardCharsets.UTF_8).toString());
        System.out.println("String indexOf() Methods use is for R "+ s1.indexOf("R") + s2.indexOf("R"));
        String indexString="Rahul Simran Raj";
        System.out.println("String lastindexOf() Methods use is for R "+ indexString.lastIndexOf("R")+ indexString.indexOf("R"));
        System.out.println("Replace method for String R with M "+ indexString.replace("R","M"));
        String tobesplitString="This is String Method";
        String[] newstring = tobesplitString.split(" ");
        for(String words : newstring){
            System.out.println(words);
        }
        String forsubstring="RahulSingh";
        System.out.println("Begin Index Test "+forsubstring.substring(5));
        System.out.println("Substring method {endindex value is ignored} for the string is "+forsubstring.substring(0,5));

        int testchar='a'; // char is conveted to UNICODE Value for eg "123" + "456" product
        int testchar1='b'+3;
        int testchar3 ='a'-'0';
        System.out.println("adding 3 to the a char "+ testchar+'3');
        System.out.println("adding 3 to the a String " + "a"+3);
        System.out.println("adding 3 to the a typecast " + (testchar+3));
        System.out.println("adding 3 to the a typecast " + testchar1);
        System.out.println("adding 3 to the a typecast " + (char)testchar3);
        try{
            int parsetest = Integer.parseInt("10");  // numeric in String Format
            System.out.println("Parse Test "+ (int)parsetest);
        }catch(NumberFormatException e){
            System.out.println("Parse Exception");
        }

        System.out.println('A'-'a');

    }

}
