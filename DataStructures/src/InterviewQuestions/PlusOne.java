package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {

    /*
            non-empty array of digits representing a non-negative integer, plus one to the integer.
            For the input array 123, the new array is 124.
            For the input array 99, the new array is 100.
            For the input array 9, the new array is 10.
            For the empty array [ ], the new array is [1].
     */

    public static void main(String[] args) {
        int testcase_1[]={9};
        System.out.println(Arrays.toString(plusone(testcase_1)));
    }

     public static int[] plusone(int[] arr){
        if(arr.length == 0){
            return new int[]{1};
        }
         //[9,9,9]
         ArrayList<Integer> list=new ArrayList<>(); // Dynamic Array Allocation
         int size=arr.length;
         int temp=0;
         int carry=0;
         int remainder=0;
         for(int i=size-1;i>=0;i--){
              if(i == size-1){
                  temp=arr[i]+1+carry;

              }else{
                  temp=arr[i]+carry;

              }
              carry=temp/10;
              remainder=temp%10;
              list.add(remainder);

         }
         list.add(carry);
         Collections.reverse(list);
         if(list.get(0) == 0){
             list.remove(0);
         }
         int[] result=list.stream().mapToInt(i->i).toArray();
         return result;
     }



}
