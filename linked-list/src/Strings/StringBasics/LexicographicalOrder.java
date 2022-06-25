package Strings.StringBasics;

public class LexicographicalOrder {
    public static String name="ababaa";
    public static String name1="baa";

    public static void main(String[] args) {
//        System.out.print(name1.compareTo(name));
        String str = "ababaa";
        System.out.println(LexicographicalMaxString(str));
    }

    static String LexicographicalMaxString(String str)
    {
        // loop to find the max lexicographic
        // substring in the substring array
        String mx = "";
        for (int i = 0; i < str.length(); ++i) {
            if (mx.compareTo(str.substring(i)) <= 0) {
                mx = str.substring(i);
            }
        }

        return mx;
    }



}
