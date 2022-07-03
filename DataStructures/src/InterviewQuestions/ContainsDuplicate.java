package InterviewQuestions;

import java.util.Arrays;

public class ContainsDuplicate {

    /*
            Given an array of integers, find if the array contains any duplicates.
            Input: [1,2,3,1]
            Output: true
            Example 2:
            Input: [1,2,3,1]
            Output: true
            Example 3:
            Input: [1,1,1,3,3,4,3,2,4,2]
            Output: true

     */

    public static void main(String[] args) {

        int testcase_1[]={1,1,1,3,3,4,3,2,4,2};
        int testcase_2[]=null;
        int testcase_3[]={};
        int testcase_4[]={1};

        System.out.println(containsDuplicate(testcase_2));
        System.out.println(containsDuplicate(testcase_1));
        System.out.println(containsDuplicate(testcase_3));
        System.out.println(containsDuplicate(testcase_4));
    }

      public static boolean containsDuplicate(int arr[]){
          try{
              if(arr.length == 0 || arr.length == 1){
//                  System.out.println("Array is Empty");
                  return false;
              }
              Arrays.sort(arr);
              for(int i=0;i<arr.length-1;i++){
                  if(arr[i]==arr[i+1]){
                      return true;
                  }
              }
          }catch(Exception e){
//              System.out.println(e.getMessage());
          }
          return false;
      }

}
