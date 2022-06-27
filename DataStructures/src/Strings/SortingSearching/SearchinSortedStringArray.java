package Strings.SortingSearching;

public class SearchinSortedStringArray {

    /*
        Given an array of strings. The array has both empty and non-empty strings. All non-empty strings are in sorted order. Empty strings can be present anywhere between non-empty strings.

        Examples:
        Input :  arr[] =  {"for", "", "", "", "geeks",
                           "ide", "", "practice", "" ,
                           "", "quiz", "", ""};
                  str = "quiz"
        Output :   10
        The string "quiz" is present at index 10 in
        given array.
     */

    /*
        Approach 1-> Use Binary Search Meaning compare with middle element if middle element is empty do linear search and find next non empty element
        and then try to do the search to see if it is in first half or second half
        Apprach 2--> Linear Search but it is Costly
     */

    //Approach 2
    public static boolean linearSearch(String str1[],String str2){
        boolean ispresent=false;
        for(String word : str1){
            if(word.equals(str2)){
                ispresent=true;
            }
        }
        return ispresent;
    }

    //Approach 1
//    public static boolean binarySearch(String str1[],String str2, int first,int last){
//        while(first<=last){
//            int mid=(first+last)/2;
//            if(str1[mid].equals(str2)) return true;
//            else{
//                if(compareString(str1[mid],str2) == -1){
//                    last=mid-1;
//                }else{
//                    first=mid+1;
//                }
//            }
//
//            if(str1[mid].equals(str2)){
//                return true;
//            }
//        }
//       return false;
//    }


    public static void main(String[] args) {

        String[] words ={"for", "", "", "", "geeks",
                "ide", "", "practice", "" ,
                "", "quiz", "", ""};
        String[] words_nonempty ={"for", "geeks",
                "ide","practice", "quiz"};

        String testcase_1="quiz";

        // TC is o(n) and space com nothing
        System.out.println("Word Search Result "+linearSearch(words,testcase_1));
    }






}
