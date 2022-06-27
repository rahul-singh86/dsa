package SlidingWindowPattern;

public class SmallestContigousSubArray {

//Given an array of positive integers and a number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.

    public static void main(String[] args) {
        int arr[]={2, 1, 5, 2, 8};
        int S=7;
        System.out.println("Smallest Contigous Array is "+findMinContigousSubArray(arr,S));
    }

 public static int findMinContigousSubArray(int arr[], int S){
     int minsize= Integer.MAX_VALUE;
     int tempsize=0;
     int tempsum=0;
     int start=0,end=0;
     while(start<=end && end<arr.length){
         tempsum=tempsum+arr[end];
         while(tempsum>=S){
             tempsize=end-start+1;
             if(tempsize<minsize){
                 minsize=tempsize;
             }
             tempsum=tempsum - arr[start];
             start++;
         }
         end++;
     }
     return minsize;
 }

}
