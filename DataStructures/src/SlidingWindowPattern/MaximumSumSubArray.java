package SlidingWindowPattern;

import java.util.Arrays;

public class MaximumSumSubArray {

    // Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.

    /*
        Algo is
        1) Start with 0 index
        2) calculate sum of first k elements from start till end such that end=start+k
        3) store it in temp var and move that window till end reaches end of array
        4) compare maxSum and swap with TempSum whenever needed and return maxSum
        5) Here we are repeating the calculation of elements (2) and not using it so we can optimize it
     */
    // Complexity is o(n*k) where n is no of elements and k is the size we have better approach for the same
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 1, 3, 2};
        String arr1[] ={"rahul"};
        int k=3;
        System.out.println("--Excecution Started--");
        try
        {
            System.out.println("Max Sum is "+maxSumSubArray(arr,3));
        }
        catch (Exception e){
            System.out.println("Max SubArray Function Call Failed");
        }
        System.out.println("--Excecution Completed--");
    }


    public static int maxSumSubArray(int arr[],int k){

        int tempSum=0;
        int maxSum=0;

        if(arr == null || k == -1 ) return -1;

        for(int start=0,end=0;end<arr.length;end=end+k){
            tempSum=findSum(arr,start,end);
            if(tempSum>maxSum){
                maxSum=tempSum;
            }
        }
        return maxSum;
    }

    //this function will find the sum of elements in between the mentioned indexes
    public static int findSum(int arr[],int start,int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
