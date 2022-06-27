package Strings.ReverseAndRotation;

public class MinRotation {

    /*
        Given a string, we need to find the minimum number of rotations required to get the same string.
            Examples:


            Input : s = "geeks"
            Output : 5

            Input : s = "aaaa"
            Output : 1
     */

    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(findRotations(str));
    }

    static int findRotations(String str)
    {
        // tmp is the concatenated string.
        String tmp = str + str;
        int n = str.length();

        for (int i = 1; i <= n; i++)
        {

            // substring from i index of original
            // string size.

            String substring = tmp.substring(
                    i, i+str.length());
            System.out.println("Substring is "+substring);
            // if substring matches with original string
            // then we will come out of the loop.
            if (str.equals(substring))
                return i;
        }
        return n;
    }


}
