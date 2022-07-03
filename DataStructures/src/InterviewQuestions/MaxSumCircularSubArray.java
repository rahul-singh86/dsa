package InterviewQuestions;

import java.util.Arrays;

public class MaxSumCircularSubArray {

    /*
        Given a circular integer array, find a subarray with the largest sum in it.
        Input:  {2, 1, -5, 4, -3, 1, -3, 4, -1}

        Output: Subarray with the largest sum is {4, -1, 2, 1} with sum 6.


        Input:  {-3, 1, -3, 4, -1, 2, 1, -5, 4}

        Output: Subarray with the largest sum is {4, -1, 2, 1} with sum 6.

     */
    public static void main(String[] args) {
        int arr[]={5,-3,-2,4,1};
//        int arrmodified[]={-5,3,2,-4,-1};
        System.out.println("MaxSum Non Circular is " + kadane(arr));
        System.out.println("MaxSum Circular is " + maxSumCircular(arr));
    }

     public static int maxSumCircular(int arr[]){
        int maxSum=kadane(arr);
        int sum= Arrays.stream(arr).sum();
        int minSubArray=kadane(Arrays.stream(arr).map(i->-i).toArray());
        System.out.println(minSubArray);
        return maxSum > 0 ? Math.max(maxSum,sum+minSubArray) : maxSum;
     }

       public static int kadane(int arr[]){
           if(arr == null) return -1;
            int maxsofar=arr[0];
            int maxsum=arr[0];
            for(int i=1;i<arr.length;i++){
                if(maxsofar<0){
                    maxsofar=0;
                }
                maxsofar=maxsofar+arr[i];
                maxsum=Math.max(maxsofar,maxsum);
            }
           return maxsum;
       }

}
