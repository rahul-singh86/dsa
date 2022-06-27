package Strings;

import java.util.Arrays;

public class ReverseWordsinString {

    public static void main(String[] args) {
        //i.like.this.program.very.much-->much.very.program.this.like.i, Each Word should be separated by .
        String Testcase_1="i.like.this.program.very.much";
        String Testcase_2="i";
        String Testcase_3="";
        String Testcase_4="i.LI KE";
        String Testcase_5=" i. ";
        String Testcase_6="i.l1237(*^ke";
        String Testcase_7=null;
        String Testcase_8="&.$"; //$.&

        System.out.println(reverseStringWords(Testcase_1));
        //System.out.println(reverseStringWords(Testcase_2));
        //System.out.println(reverseStringWords(Testcase_3));
        System.out.println(reverseStringWords(Testcase_4));
        System.out.println(reverseStringWords(Testcase_5));
        System.out.println(reverseStringWords(Testcase_6));
        System.out.println(reverseStringWords(Testcase_7));
        System.out.println(reverseStringWords(Testcase_8));



    }

    static String reverseStringWords(String s){


        try{
            s=s.replaceAll("[ ]","");

            StringBuffer br=new StringBuffer();
            if(s.length() == 1) return s;
            String tokens[]=s.split("[.]");
           // System.out.println(Arrays.toString(tokens));
            for(int i=tokens.length-1;i>0;i--){
                br.append(tokens[i]);
                br.append(".");
            }

            br.append(tokens[0]);
            return br.toString();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }


}
