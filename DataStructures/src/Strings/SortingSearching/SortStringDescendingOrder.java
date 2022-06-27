package Strings.SortingSearching;

public class SortStringDescendingOrder {
    static final int MAX_CHAR=26;

    /*
            Given a string, sort it in descending order.
            Input : alkasingh
            Output : snlkihgaa

            Input : nupursingh
            Output : uusrpnnihg

            Input : geeksforgeeks
            Output : ssrokkggfeeee
     */

    /*
            Approach 1 --> Sort the String and Print it reverse
            Approach 2 --> Letter Array and then append in StringBuffer in Reverse Order-- Better Approach
     */

    public static String reverse(String s){
        int start=0;
        char[] reversedchar=s.toCharArray();
        int end=s.length()-1;
        while(start<=end){
            char temp=reversedchar[start];
            reversedchar[start]=reversedchar[end];
            reversedchar[end]=temp;
            start++;
            end--;
        }
        return reversedchar.toString();
    }

    public static String stringHashSortReverse(String s){
        int[] letters=new int[MAX_CHAR];
        StringBuilder sortedstring=new StringBuilder();
        for(char c : s.toCharArray()){
            letters[c-'a']+=1;
        }

        for(int i=0;i<letters.length;i++){
            char toappend = (char)(i+'a');
            int retrivedcount=letters[i];
            while(retrivedcount>0){
                sortedstring.append(toappend);
                retrivedcount--;
            }
        }
        return sortedstring.reverse().toString();
    }

    public static void main(String[] args) {
        String testcase1="bbccdefbbaa";
        String testcase2="geeksforgeeks";

        //TestCases
        System.out.println(stringHashSortReverse(testcase1));
        System.out.println(stringHashSortReverse(testcase2));

    }

}
