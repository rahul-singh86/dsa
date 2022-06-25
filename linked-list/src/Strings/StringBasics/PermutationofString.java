package Strings.StringBasics;

public class PermutationofString {
    /*
    Input: ABC
    Output:
    ABC ACB BAC BCA CAB CBA
    s.substring(1)-->BC s.substring(0,1)
    i  j  s.substring(j) + s.substring(i,j)
    0  1  BC+A
    0  2  C+AB
    1  0  ABC+0
    2  1  BC+
     */

    public static void main(String[] args) {
        //find("ABC",0,3);
        System.out.println("Hey "+printPermutn("ABC",""));
    }
    public static void swap(char x,char y){
       char temp=x;
       x=y;
       y=temp;
    }

    static int printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return 0;
        }
            int counter=0;
        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call

            printPermutn(ros, ans + ch);
            counter++;
        }
        return counter;
    }
//ABC

    // To be implemented]
    public static void find(String s, int l , int r) {
        if (l == r) {
            System.out.print(s.charAt(l));
        } else {
            for (int i = l; i < s.length(); i++) {
                swap(s.charAt(i),s.charAt(l));
                find(s, l + 1, r);
                swap(s.charAt(i),s.charAt(l));
            }
        }
    }
}
