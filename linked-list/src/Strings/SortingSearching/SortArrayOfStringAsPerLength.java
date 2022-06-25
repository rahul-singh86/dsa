package Strings.SortingSearching;

import java.util.*;

public class SortArrayOfStringAsPerLength {
    /*
            We are given an array of strings, we need to sort the array in increasing order of string lengths.
            Examples:

            Input : {"GeeksforGeeeks", "I", "from", "am"}
            Output : I am from GeeksforGeeks

            Input :  {"You", "are", "beautiful", "looking"}
            Output : You are looking beautiful
     */

     /*     Assumption is output is space delimited
            Approach 1--> HashMap with String and Length and print as per increasing Value
            Approach 2--> Use Bubble Sort(o(n2) or Insertion Sort(o(nlogn) of any Kind and return the result

      */

        //Approach 1
        public static String sortStringHashMap(String s[]){
            StringBuffer sortedString=new StringBuffer();
            HashMap<String,Integer> wordmap=new HashMap<>();
            for(String word : s){
                wordmap.put(word,word.length());
            }
            HashMap<String, Integer> newmap = sortByValue(wordmap);
            return newmap.toString();
        }

    //Approach 2
    static String sort(String[] s, int n) {
        String toreturn="";
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i + 1; j < n; j++) {
                if (s[i].length() > s[j].length()) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for(String words : s){
            toreturn=toreturn+words+" ";
        }
        return toreturn;
    }


    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list
                = new LinkedList<Map.Entry<String, Integer> >(
                hm.entrySet());

        // Sort the list using lambda expression
        Collections.sort(
                list,
                (i1,
                 i2) -> i1.getValue().compareTo(i2.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp
                = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        String testcase_1[]={"GeeksforGeeeks", "I", "from", "am"};
        String testcase_2[]={"You", "are", "beautiful", "looking"};

        System.out.println(sortStringHashMap(testcase_1));
        System.out.println(sort(testcase_2,testcase_2.length));
    }

}
