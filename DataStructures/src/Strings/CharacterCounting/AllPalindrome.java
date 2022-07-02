package Strings.CharacterCounting;

public class AllPalindrome {
    public static void main(String[] args) {
        String testcase_1="bab";
         findAllPalindromicSubString(testcase_1);
         System.out.println("No of Palind "+expand(testcase_1));

    }


    public static int isPalindromewithindex(int startindex,int endindex,char[] ch){
        //aabaa
        int res=0;
        while(startindex>=0 && endindex < ch.length && ch[startindex--]==ch[endindex++])
           res++;
       return res;
    }


    public static int expand(String s){
        if(s.length()==0) return -1 ;
        char[] c= s.toCharArray();
        int res=0;
        for(int i=0;i<s.length();i++){
           res+=isPalindromewithindex(i,i,c);
           res+=isPalindromewithindex(i,i+1,c);
        }
        return res;
    }


    //TC is 0(n2) and SC is O(n)
    public static void findAllPalindromicSubString(String s){

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String tocheck=s.substring(i,j);
//                System.out.println(tocheck);
                if(isPalindrome(tocheck)){
                    System.out.println(tocheck);
                }
            }
        }
    }

    public static boolean isPalindrome(String s){
        //aabaa
        if(s.length() == 1) return false;
        int start = 0;
        boolean isPalindrome=false;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
                isPalindrome=true;
            }else{
                isPalindrome=false;
                break;

            }
        }
    return isPalindrome;
    }

}
