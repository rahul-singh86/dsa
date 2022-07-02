package InterviewQuestions;

public class MinorMaxElementArray {

    /*
            Given an array A[] of size n, you need to find the maximum and minimum element present in the array. Your algorithm should make the minimum number of comparisons.
            Input: A[] = { 4, 2, 0, 8, 20, 9, 2} Output: Maximum: 20, Minimum: 0
            Input: A[] = {-8, -3, -10, -32, -1}  Output: Maximum: -1, Minimum: -32

     */

    //0(n) Solution Better then Sorting with nlogn solution

    public static void main(String[] args) {
        int arr[]={-8, -3, -10, -32, -1};
        System.out.println("Min Value is "+findMin(arr));
        System.out.println("Max Value is "+findMax(arr));
    }

      public static int findMin(int arr[]){
          int min=Integer.MAX_VALUE;
          for(int ele : arr){
              if(ele < min){
                  min=ele;
              }
          }
          return min;
      }

    public static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > max){
                max=ele;
            }
        }
        return max;
    }


}
