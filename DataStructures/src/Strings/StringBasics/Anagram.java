package Strings.StringBasics;

public class Anagram {
// What is Anagram? --> Leet and eetL
/*
        1 Case sentive Character are considered or not?
        2 Alphanumeric is consderd ot not? do we need to remove
        3 Special Characters is consderd ot not? do we need to remove
        4 Spaces ?
        5 Null or Empty? False
        6 a aaa? no
        7 a a yes
        8 A a no
        9 "a " and "a"--? yes or no--> remove--yes
        10 "a1" and "a"--?--> special remove--yes
        11 "a--" and "a"--?--> -- remove --yes
        12 "Rahul 123*%*" "123*%*% )* uhRal"--> yes
        13 if first string is empty and second string is not ? false
 */

    public static void main(String[] args) {
        System.out.println(unicodeApproch("rahul","ahula"));
        System.out.println(unicodeApproch("a","aaa"));
        System.out.println(unicodeApproch("a","a"));

    }

    public static boolean unicodeApproch(String s1, String s2){
        if(s1.isEmpty() || s2.isEmpty()) return false;
        //if(s1.length()!=s2.length()) return false;
        s1=s1.replaceAll("[^a-zA-Z]","");
        s2=s2.replaceAll("[^a-zA-Z]","");

        System.out.println(s1);
        System.out.println(s2);

            int unicodearr[]=new int[26];
    try{
            for(int i=0;i<s1.toCharArray().length;i++) {

                unicodearr[s1.charAt(i)-'a'] ++;
                unicodearr[s2.charAt(i)-'a'] --;
            }

            for(int i=0;i<unicodearr.length;i++){
               if(unicodearr[i]!=0){
                   return false;
               }else{
                   return true;
               }
            }}catch (Exception e){
        System.out.println(e.getMessage());
    }

        return false;
    }




}
