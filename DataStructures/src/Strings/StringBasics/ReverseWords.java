package Strings.StringBasics;

public class ReverseWords {
    //S = i.like.this.program.very.much ==> much.very.program.this.like.i

    public static void main(String[] args) {
        String stringtoberevered="i.like.this.program.very.much";
        System.out.println("Revered String is :-"+ reverseWords(stringtoberevered));
    }
// Time Complexity = O(n) + O(n)= 0(n) Space Complexity= O(n)
    public static String reverseWords(String words){

        if(words.isEmpty()) return "Empty String Provided";
        String wordsarray[]= words.split("[.]");
        StringBuffer reversed=new StringBuffer();
        for(int i=wordsarray.length-1;i>0;i--){
            reversed.append(wordsarray[i]);
            reversed.append(".");
        }
      reversed.append(words.charAt(0));
      return reversed.toString();
    }

}
