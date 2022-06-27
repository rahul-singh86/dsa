package Strings;

public class FirstNonRepeatedCharPrint {
//  Morning then M is first NonRepeated Char of String

    public static void main(String[] args) {
        String testcase_1="Morning"; //M
        String testcase_2=null; // ''
        String testcase_3="M";// ''
        String testcase_4=" aabbccDD "; //''
        String testcase_5="This is My Duplicate Char Stirng 123%(%("; //'T'
        String testcase_6=""; // ''

        System.out.println(printFirstCharNonRepeated(testcase_1));
        System.out.println(printFirstCharNonRepeated(testcase_2));
        System.out.println(printFirstCharNonRepeated(testcase_3));
        System.out.println(printFirstCharNonRepeated(testcase_4));
        System.out.println(printFirstCharNonRepeated(testcase_5));
        System.out.println(printFirstCharNonRepeated(testcase_6));
    }

    static char printFirstCharNonRepeated(String s){

        char result=Character.MIN_VALUE;
        try{
            s=s.replaceAll("[^a-zA-Z]","");
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(s.indexOf(ch) == s.lastIndexOf(ch)){
                    result=ch;
                    return result;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }



}
