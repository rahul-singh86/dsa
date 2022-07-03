package InterviewQuestions;

import java.util.Arrays;

public class ProductArray {

    /*
            product of all the elements in the given array except element
            Input:  [1,2,3,4]
            Output: [24,12,8,6]
     */

    public static void main(String[] args) {
        int testcase_1[]={1,2,3,4};
        System.out.println(Arrays.toString(productofArraywithDivision(testcase_1)));

    }



    public int[] productExceptSelfwithoutdivision(int[] nums) {

        int leftArray[]=new int[nums.length];
        int rightArray[]=new int[nums.length];

        leftArray[0]=1;
        for(int i=1;i<nums.length;i++){
            leftArray[i]=nums[i-1]*leftArray[i-1];
        }

        rightArray[nums.length-1]=1;

        for(int i=nums.length-2;i>=0;i--){
            rightArray[i]=nums[i+1]*rightArray[i+1];
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=leftArray[i]*rightArray[i];
        }

        return nums;
    }

    //using Division
     public static int[] productofArraywithDivision(int arr[]){
         int product=1;
         for(int element : arr){
             product=product*element;
         }

         for(int i=0;i<arr.length;i++){
             arr[i]=product/arr[i];
         }

         return arr;
     }


}
